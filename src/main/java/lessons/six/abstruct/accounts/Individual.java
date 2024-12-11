package lessons.six.abstruct.accounts;

import java.math.BigDecimal;

public class Individual extends Client {

    public Individual(BigDecimal amount, int account) {
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

        System.out.println("!!!!!!ИНФОРМАЦИЯ!!!!! Счет: физлицо.");
        System.out.println("Условия снятия: без комиссии");
        System.out.println("Условия пополнения: без комиссии");
        System.out.println("Баланс на счету: " + super.getAmount());
        System.out.println();
    }

    @Override
    protected boolean getInformation(char type) {

        switch (type) {
            case 'r': {
                System.out.println("Счет физлица.");
                System.out.println("Условия пополнения: без комиссии");
                break;
            }
            case 'w': {
                System.out.println("Счет физлица.");
                System.out.println("Условия снятия: без комиссии");
                break;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "Individuals{}";
    }
}
