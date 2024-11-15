package lesson6.inheritance.bankSystem;

import java.time.LocalDate;

public class Menu {
    public static void main(String[] args) {

        System.out.println("******************************                  ANNA                  ******************************");
        System.out.println("\nСоздаем ОБЫЧНЫЙ СЧЕТ");
        BankAccount anna = new BankAccount("Anna", 400);
        withdraw(anna, 300.00);
        System.out.println("******************************                  TONYA                  ******************************");
        System.out.println("\nСоздаем ДЕПОЗИТ");
        Deposit tonya = new Deposit("Tonya", 333, LocalDate.of(2024, 10, 14));
        System.out.println("\nКогда в последний раз пополнялся:\n"+tonya.getDateRep());
        withdraw(tonya, 334.00);
        withdraw(tonya, 200.00);
        System.out.println("\nПополняем баланс на 100 деняк. Проверка:");
        tonya.replacement(100);
        withdraw(tonya, 100.00);
        System.out.println("******************************                  LERA                  ******************************");
        System.out.println("\nСоздаем КАРТОЧНЫЙ СЧЕТ");
        Card lera = new Card("Lera", 2000);
        withdraw(lera, 100.00);
        transfer(lera,tonya,100.00);
        transfer(anna,lera,100.00);

    }
    public static void withdraw(BankAccount account, Double amount){
        checkBalance(account);
        System.out.println("\nПопробуем снять "+ amount);
        account.withdraw(amount);
        System.out.println("\nБаланс после этого:");
        System.out.println(account.getBalance());
    }

    public static void checkBalance(BankAccount account){
        System.out.println("\nПроверка баланса Леры"+ account.getClientName()+":");
        System.out.println(account.getBalance());
    }

    public static void transfer(BankAccount bankAccountTo, BankAccount bankAccountFrom, Double amount){
        System.out.println("*********************                  "+bankAccountFrom.getClientName()+"-->"+bankAccountTo.getClientName()+"                  *********************");
        checkBalance(bankAccountFrom);
        checkBalance(bankAccountTo);
        System.out.println("\nПеревод "+amount+" деняк от "+bankAccountFrom.getClientName()+" к "+bankAccountTo.getClientName());
        bankAccountFrom.send(bankAccountTo,amount);
        checkBalance(bankAccountFrom);
        checkBalance(bankAccountTo);
    }
}
