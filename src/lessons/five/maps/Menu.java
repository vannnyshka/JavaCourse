package lessons.five.maps;


import java.util.*;


public class Menu {


    private static Map<String, BankAccount> accInf = new HashMap<>();

    //private static Map<Currency, Map<Currency, Double>> rates = new HashMap<>();

    public static void main(String[] args) {

        //rates.put(Currency.BYN, );

        //create BankAccounts
        BankAccount varya = new BankAccount("Varvara Andreevna", 54.4, Currency.BYN);
        BankAccount anna = new BankAccount("Anna Valerevna", 40000.3, Currency.USD);
        BankAccount tosys = new BankAccount("Antonina", 500, Currency.EUR);
        BankAccount vasya = new BankAccount("Vasya Korneevich", 450, Currency.USD);

        //Добавляем информацию по счетам
        addBankAccount("1111111", varya);
        addBankAccount("1111112", anna);
        addBankAccount("1111111", tosys);
        addBankAccount("1111114", vasya);

        printBankAccounts();

        //Пополняем счет
        upMoney("1111113", 46.5);
        //Mommy пополняет balance
        upMoney("1111111", 46.5);

        printBankAccounts();

        //Снимем со счета
        withdrawMoney("1111111", 550);
        withdrawMoney("1111111", 50);

        printBankAccounts();

        //Перевод со счета: различный счет
        transferMoney("1111111", "1111112", 1000);

        //Перевод со счета: норм
        transferMoney("1111112", "1111114", 1001);
        printBankAccounts();

        //Перевод со счета: клиент не найден
        transferMoney("1111113", "1111112", 1001);

        //Вася получает balance
        System.out.println(getAccBalance("1111114") + "\n");


        printBankAccounts();

    }

    private static void upMoney(String clientId, double sum) {

        if (accInf.containsKey(clientId)) {
            accInf.get(clientId).replacement(sum);
            System.out.println("Баланс счета #" + clientId + " пополнен на " + sum + ".");
        } else {
            System.out.println("Клиент #" + clientId + " не найден.");
        }

        System.out.println();

    }

    private static void withdrawMoney(String clientId, double sum) {

        if (accInf.containsKey(clientId)) {

            if (accInf.get(clientId).withdraw(sum)) {
                System.out.println("Сумма со счета #" + clientId + " успешно снята.");
            } else {
                System.out.println("На счету #" + clientId + " недостаточно средств.");
            }

        } else {
            System.out.println("Клиент #" + clientId + " не найден.");
        }

        System.out.println();

    }

    private static void transferMoney(String clientIdFrom, String clientIdTo, double sum) {

        System.out.println("Попытка перевода с #" + clientIdFrom + " на #" + clientIdTo + ".");

        if (accInf.containsKey(clientIdFrom) && accInf.containsKey(clientIdTo)) {
            if (accInf.get(clientIdFrom).getCurrency().equals(accInf.get(clientIdTo).getCurrency())) {

                if (accInf.get(clientIdFrom).withdraw(sum)) {
                    accInf.get(clientIdFrom).replacement(sum);
                    System.out.println("Перевод выполнен успешно.");
                } else {
                    System.out.println("Недостаточно средств.");
                }

            } else {
                System.out.println("Нельзя перевести деньги с различных валютных счетов");
            }

        } else {
            System.out.println("Один из клиентов не найден");
        }

        System.out.println();

    }

    private static void addBankAccount(String clientId, BankAccount account) {

        accInf.put(clientId, account);

    }

    private static double getAccBalance(String clientId) {
        System.out.println("Запрос баланса для #" + clientId);
        if (accInf.containsKey(clientId)) {
            return accInf.get(clientId).getBalance();
        } else {
            System.out.println("Клиент #" + clientId + " не найден");
        }
        System.out.println();
        return 0;
    }


    private static void printBankAccounts() {
        for (Map.Entry entry : accInf.entrySet()) {

            System.out.println(entry);

        }

        System.out.println();

    }


    public void printAccountsSortedByBalance() {
        accInf.values().stream()
                .sorted(Comparator.comparingDouble(BankAccount::getBalance).reversed())
                .forEach(account -> System.out.println(account.getClientName() + ": " + account.getBalance()));
    }
}


