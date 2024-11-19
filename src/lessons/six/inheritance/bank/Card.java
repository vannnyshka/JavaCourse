package lessons.six.inheritance.bank;

public class Card extends BankAccount {

    private static final double COMMISSION = 0.01;

    public Card(String clientName, double balance) {
        super(clientName, balance);
    }


    public boolean send(BankAccount receiver, double amount) {

        System.out.println("ЗАХОДИМ СЮДА CARD");
        //у того объекта, к которому обращаемся вызовется переопределенный withdraw(если такой есть)?
        if (withdraw(amount)) {
            //у того объекта, которым вызывали метод send вызовется переопределенный replacement(если такой есть)?
            receiver.replacement(amount);
            return true;
        }
        return false;
    }


    public boolean withdraw(double amount) {

        amount += amount * COMMISSION;
        System.out.println("Внимание! При попытки снятия с карточного счета взимается комиссия 1%");
        System.out.println("Итоговая сумма снятия: " + amount);
        return super.withdraw(amount);
    }

}
