package lessons.nine.files.task.csv.account;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AcctTurn {

    private static final String actPathFile = "src/main/resources/nine/files/cvs/movementList.csv";
    private static String dateFormat = "dd.MM.yyyy";
    static ArrayList<AcctTurn> turns = new ArrayList<>();

    //Тип счёта,Номер счета,Валюта,Дата операции,Референс проводки,Описание операции,Приход,Расход
    private String acctType;
    private String account;
    private Currency cur;
    private Date date;
    private String reference;
    private String describe;
    private BigDecimal income;
    private BigDecimal expense;
    private String operationName;


    public String getAcctType() {
        return acctType;
    }

    public String getAccount() {
        return account;
    }

    public Currency getCur() {
        return cur;
    }

    public Date getDate() {
        return date;
    }

    public String getDescribe() {
        return describe;
    }

    public String getReference() {
        return reference;
    }

    public BigDecimal getExpense() {
        return expense;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public String getOperationName() {
        return operationName;
    }

    public AcctTurn(String acctType, String account, Currency cur, Date date, String reference, String describe, BigDecimal income, BigDecimal expense, String operationName) {
        this.acctType = acctType;
        this.account = account;
        this.cur = cur;
        this.date = date;
        this.reference = reference;
        this.describe = describe;
        this.income = income;
        this.expense = expense;
        this.operationName = operationName;
    }

    public static void loadTurnFromFile() {
        try {

            List<String> lines = Files.readAllLines(Paths.get(actPathFile));
            for (String line : lines) {
                //( ?=   (?: [^\"]*\"  [^\"]*\" )*   [^\"]* $ )
                //?= - оператор просмотра вперед.
                //(?: [^\"]*\"  [^\"]*\" )*  - ноль или более повторений подвыражения [^\"]*\"  [^\"]*\"
                //подвыражение [^\"]*\"  [^\"]*\" состоит из:
                //[^\"]* - подстрока, которая не содержит кавычек.
                //После которой следует кавычка \"
                //После кавычки опять следует выражение, которое не содержит качек [^\"]*
                //И потом опять кавычка \"
                //Проще говоря - это пара сбаланчированных кавычек

                //[^\"]* - эта подгруппа соответствует нулю или более повторениям любого символа, кроме кавычек.
                //          Она соответствует подстрокам, которые не содержат кавычек.

                String[] fragments = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                if (fragments.length != 8) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }

                Currency cur;

                switch (fragments[3]) {
                    case "USD":
                        cur = Currency.USD;
                        break;
                    case "EUR":
                        cur = Currency.EUR;
                        break;
                    default:
                        cur = Currency.RUR;
                }

                String operationName = "";

                //Вычленим название операции, по которым нам необходимо будет группировать
                //Обрабатываем описание
                Pattern pattern = Pattern.compile("^\\d{6}.*?\\d{4}(.*?)\\d{2}\\.\\d{2}\\.\\d{2}.*?");

                Matcher matcher1 = pattern.matcher(fragments[5]);
                if (matcher1.matches()) {
                    operationName = matcher1.group(1).trim();
                    System.out.println("Часть 1: " + operationName);
                }


                //Для сумм, которые могут приходить в формате "12323,23"
                fragments[6] = fragments[6].replace("\"","").replace(",",".");
                fragments[7] = fragments[7].replace("\"","").replace(",",".");

                turns.add(new AcctTurn(
                        //Тип счёта,Номер счета,Валюта,Дата операции,Референс проводки,Описание операции,Приход,Расход
                        fragments[0],
                        fragments[1],
                        cur,
                        (new SimpleDateFormat(dateFormat)).parse(fragments[3]),
                        fragments[4],
                        fragments[5],
                        BigDecimal.valueOf(Double.parseDouble(fragments[6])),
                        BigDecimal.valueOf(Double.parseDouble(fragments[7])),
                        operationName
                ));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void totalIncome() {


        System.out.println("Сумма доходов: " + turns.stream().map(AcctTurn::getIncome).reduce(BigDecimal.ZERO, BigDecimal::add));

    }

    public static void totalExpense() {

        System.out.println("Сумма расходов: " + turns.stream().map(AcctTurn::getExpense).reduce(BigDecimal.ZERO, BigDecimal::add));

    }

    public static void expenseByOrganization() {

        Map<String, BigDecimal> expenseByOrganization = turns.stream().collect(Collectors.groupingBy(AcctTurn::getOperationName, Collectors.reducing(BigDecimal.ZERO, AcctTurn::getExpense, BigDecimal::add)));
        for (String contact : expenseByOrganization.keySet()) {
            System.out.println(contact + ": " + expenseByOrganization.get(contact));
        }
    }

    public static void printTurns() {

        turns.stream().forEach(System.out::println);

    }


    @Override
    public String toString() {
        return "AcctTurn{" +
                "acctType='" + acctType + '\'' +
                ", account='" + account + '\'' +
                ", cur=" + cur +
                ", date=" + date +
                ", reference='" + reference + '\'' +
                ", describe='" + describe + '\'' +
                ", income=" + income +
                ", expense=" + expense +
                ", operationName='" + operationName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcctTurn acctTurn = (AcctTurn) o;
        return Objects.equals(acctType, acctTurn.acctType) && Objects.equals(account, acctTurn.account) && cur == acctTurn.cur && Objects.equals(date, acctTurn.date) && Objects.equals(reference, acctTurn.reference) && Objects.equals(describe, acctTurn.describe) && Objects.equals(income, acctTurn.income) && Objects.equals(expense, acctTurn.expense) && Objects.equals(operationName, acctTurn.operationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acctType, account, cur, date, reference, describe, income, expense, operationName);
    }
}
