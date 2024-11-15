package lesson6.inheritance.bankSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;


public class Deposit extends BankAccount {
    /*•	Депозитный расчётный счёт, с которого нельзя снимать деньги в течение месяца после последнего внесения.*/

    private LocalDate dateRep;


    public Deposit(String name, double balance, LocalDate dateRep) {
        super(name, balance);
        this.dateRep = dateRep;
    }


    public LocalDate getDateRep() {
        return dateRep;
    }

    public boolean send(BankAccount receiver, double amount) {

        System.out.println("ЗАХОДИМ СЮДА DEPOSIT");
        //у того объекта, к которому обращаемся вызовется переопределенный withdraw(если такой есть)?
        if (withdraw(amount)) {
            //у того объекта, которым вызывали метод send вызовется переопределенный replacement(если такой есть)?
            receiver.replacement(amount);
            return true;
        }
        return false;
    }


    @Override
    public boolean withdraw(double amount) {

        if (ChronoUnit.MONTHS.between(this.dateRep, LocalDate.now()) >= 1) {
            return super.withdraw(amount);
        } else {
            System.out.println("С депозита нельзя снимать деньги в течении одного месяца после его пополнения.");
        }
        return false;
    }


    @Override
    public boolean replacement(double amount) {
        this.dateRep = LocalDate.now();
        return super.replacement(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Deposit deposit = (Deposit) o;
        return Objects.equals(dateRep, deposit.dateRep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateRep);
    }

    @Override
    public String toString() {
        return "Deposit{" + "dateRep=" + dateRep + '}';
    }

}
