package lessons.six.abstruct.accounts;

import java.math.BigDecimal;
import java.util.Scanner;

public class IndividualEntrepreneur extends Client {

    private static final BigDecimal COMMISSION_BEFORE1000 = new BigDecimal("0.01");
    private static final BigDecimal COMMISSION_AFTER1000 = new BigDecimal("0.005");

    public IndividualEntrepreneur(BigDecimal amount, int account) {
        super(amount, account);
    }

    @Override
    public void replacement(BigDecimal sum) {

        System.out.println("Пополнение на: " + sum);
        if (getInformation('r')) {

            int compareRes = sum.compareTo(new BigDecimal("1000"));

            if (compareRes >= 0) {
                System.out.println("Пополнение на(после перерасчета): " + sum.subtract(sum.multiply(COMMISSION_AFTER1000)));
                super.setAmount(super.getAmount().add(sum.subtract(sum.multiply(COMMISSION_AFTER1000))));
                System.out.println("Баланс на счету после пополнения: " + super.getAmount());
                System.out.println();
            } else {
                System.out.println("Пополнение на(после перерасчета): " + sum.subtract(sum.multiply(COMMISSION_BEFORE1000)));
                super.setAmount(super.getAmount().add(sum.subtract(sum.multiply(COMMISSION_BEFORE1000))));
                System.out.println("Баланс на счету после пополнения: " + super.getAmount());
                System.out.println();
            }
        } else {
            System.out.println("Баланс на счету: " + super.getAmount());
            System.out.println();
        }
    }


    @Override
    public BigDecimal withdraw(BigDecimal sum) {

        System.out.println("Cумма снятия: " + sum);
        getInformation('w');
        int comparisonResult = super.getAmount().compareTo(sum);

        if (comparisonResult >= 0) {
            super.setAmount(super.getAmount().subtract(sum));
            System.out.println("Баланс на счету после снятия: " + super.getAmount());
            System.out.println();
        } else {
            System.out.println("Недостаточно средств");
            System.out.println("Баланс на счету: " + super.getAmount());
            System.out.println();
        }

        return super.getAmount();
    }

    public void getInformation() {

        System.out.println("!!!!!!ИНФОРМАЦИЯ!!!!! Счет: индивидуальный предпрениматель.");
        System.out.println("Условия снятия: без комиссии");
        System.out.println("Условия пополнения: комиссия 1%, если сумма меньше 1000; комиссия 0.5%, если сумма больше 1000(включительно).");
        System.out.println("Баланс на счету: " + super.getAmount());
        System.out.println();
    }

    @Override
    protected boolean getInformation(char type) {

        switch (type) {
            case 'r': {
                System.out.println("Счет индивидуального предпринимателя.");
                System.out.println("Условия пополнения: комиссия 1%, если сумма меньше 1000; комиссия 0.5%, если сумма больше 1000(включительно).");
                System.out.println("Желаете продолжить?");
                System.out.println("1. Да");
                System.out.println("2. Нет");
                Scanner input = new Scanner(System.in);
                int answer = input.nextInt();
                if (answer == 1) {
                    System.out.println("Операция подтверждена.");
                    return true;
                } else if (answer == 2) {
                    System.out.println("Операция отменена.");
                    return false;
                } else {
                    System.out.println("Операция сброшена. Вы ввели неверное значение.");
                    return false;
                }
            }
            case 'w': {
                System.out.println("Счет индивидуального предпринимателя.");
                System.out.println("Условия снятия: без комиссии.");
                break;
            }
        }
        return true;
    }
}
