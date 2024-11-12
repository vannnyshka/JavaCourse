package lesson5.t5_11_2_mapBankAcc;

import java.util.Objects;

public class BankAccount {

    private String clientName;
    private double balance;
    private Currency currency;


    public BankAccount(String clientName, double balance, Currency currency) {
        this.clientName = clientName;
        this.balance = balance;
        this.currency = currency;
    }

    public BankAccount() {
    }

    public String getClientName() {
        return clientName;
    }

    public boolean withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public void replacement(double amount) {
        this.balance += amount;
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(clientName, that.clientName) && currency == that.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, balance, currency);
    }

    @Override
    public String toString() {
        return "Клиент: " + clientName + ", баланс: " + balance + " " + currency;
    }
}
