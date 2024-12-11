package lessons.six.abstruct.accounts;

import java.math.BigDecimal;
import java.util.Scanner;

public class LegalEntity extends Client {

    private static final BigDecimal COMMISSION = new BigDecimal("0.01");

    public LegalEntity(BigDecimal amount, int account) {
        super(amount, account);
    }

    @Override
    public void replacement(BigDecimal sum) {
        System.out.println("Пополнение на: " + sum);
        getInformation('r');
        super.setAmount(super.getAmount().add(sum));
        System.out.println("Баланс на счету после пополнения: " + super.getAmount());
        System.out.println();
    }


    @Override
    public BigDecimal withdraw(BigDecimal sum) {

        int comparisonResult = super.getAmount().compareTo(sum.add(sum.multiply(COMMISSION)));
        System.out.println("Cумма снятия: " + sum);
        if (getInformation('w')) {
            if (comparisonResult >= 0) {
                System.out.println("Cумма снятия(после перерасчета): " + sum.add(sum.multiply(COMMISSION)));
                super.setAmount(super.getAmount().subtract(sum.add(sum.multiply(COMMISSION))));
                System.out.println("Баланс на счету после снятия: " + super.getAmount());
                System.out.println();
            } else {
                System.out.println("Недостаточно средств");
                System.out.println("Баланс на счету: " + super.getAmount());
                System.out.println();
            }
        } else {
            System.out.println("Баланс на счету: " + super.getAmount());
        }
        return super.getAmount();
    }

    public void getInformation() {

        System.out.println("!!!!!!ИНФОРМАЦИЯ!!!!! Счет: юрлицо.");
        System.out.println("Условия снятия: комиссия 1%");
        System.out.println("Условия пополнения: без комиссии");
        System.out.println("Баланс на счету: " + super.getAmount());
        System.out.println();
    }

    @Override
    protected boolean getInformation(char type) {

        switch (type) {
            case 'r': {
                System.out.println("Счет юрлица.");
                System.out.println("Условия пополнения: без комиссии");
                break;
            }
            case 'w': {
                System.out.println("Счет юрлица.");
                System.out.println("Условия снятия: комиссия 1%");
                System.out.println("Желаете продолжить?");
                System.out.println("1. Да");
                System.out.println("2. Нет");
                Scanner input = new Scanner(System.in);
                int answer = input.nextInt();

                if (answer == 1) {
                    System.out.println("Операция подтверждена.");
                    System.out.println();
                    return true;
                } else if (answer == 2) {
                    System.out.println("Операция отменена.");
                    System.out.println();
                    return false;
                } else {
                    System.out.println("Операция сброшена. Вы ввели неверное значение.");
                    System.out.println();
                    return false;
                }
            }
        }

        return true;
    }
}
