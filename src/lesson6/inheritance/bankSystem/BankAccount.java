package lesson6.inheritance.bankSystem;

import java.util.Objects;

public class BankAccount {


    private String clientName;
    private double balance;


    public BankAccount(String clientName, double balance) {
        this.clientName = clientName;
        this.balance = balance;

    }


    public String getClientName() {
        return clientName;
    }

    public boolean send(BankAccount receiver, double amount) {

        System.out.println("ЗАХОДИМ СЮДА BANK ACC");
        //у того объекта, к которому обращаемся вызовется переопределенный withdraw(если такой есть)?
        if (withdraw(amount)) {
            //у того объекта, которым вызывали метод send вызовется переопределенный replacement(если такой есть)?
            receiver.replacement(amount);
            return true;
        }
        return false;
    }


    public boolean withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            System.out.println("Деньги успешно сняты со счета.");
            return true;
        } else {
            System.out.println("Недостаточно средств!");
            return false;
        }
    }

    public boolean replacement(double amount) {
        this.balance += amount;
        System.out.println("Баланс успешно пополнен!");
        return true;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(clientName, that.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "clientName='" + clientName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
