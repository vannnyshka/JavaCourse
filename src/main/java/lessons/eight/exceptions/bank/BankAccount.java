package lessons.eight.exceptions.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BankAccount{
    /*Задача 8.1 Исключения в java📍
     #### Описание
     Создайте Java-приложение, моделирующее банковские операции, с использованием обработки стандартных и пользовательских исключений.

     #### Требования

     1. **Создайте класс BankAccount** со следующими полями:
        - accountNumber (номер счета, типа String)
        - balance (баланс счета, типа double)

     2. **Реализуйте методы класса BankAccount:**
        - deposit(double amount) — метод для пополнения счета. Если сумма пополнения меньше или равна нулю, выбросьте исключение IllegalArgumentException с сообщением "Сумма должна быть положительной".
        - withdraw(double amount) — метод для снятия средств. Если сумма больше текущего баланса, выбросьте пользовательское исключение InsufficientFundsException с сообщением "Недостаточно средств на счете".
        - transfer(BankAccount targetAccount, double amount) — метод для перевода денег на другой счет. Используйте методы withdraw и deposit для выполнения операции, и обработайте все возможные исключения. Если targetAccount равен null, выбросьте NullPointerException.

     3. **Создайте пользовательское исключение InsufficientFundsException:**
        - Этот класс должен наследоваться от Exception и принимать сообщение в конструкторе.
     Создайте тестовый класс Main:ласс Main:**
        - Попробуйте сделать пополнение счета отрицательной суммой и обработайте исключение.
        - Попробуйте снять сумму, превышающую баланс, и обработайте исключение.
        - Попробуйте перевести сумму с одного счета на другой, обработав возможные исключения.

     #### Дополнительно
     1. Напишите тестовые случаи для проверки всех исключений и их сообщений.
     2. Добавьте проверку на любые другие непредвиденные ошибки, чтобы убедиться, что приложение работает стабильно.*/

    private static List<BankAccount> bankAccounts = new ArrayList<>();

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }
    /* - deposit(double amount) — метод для пополнения счета. Если сумма пополнения меньше или равна нулю, выбросьте исключение IllegalArgumentException с сообщением "Сумма должна быть положительной".*/
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");
        }
        this.balance += amount;
        System.out.println("Баланс успешно пополнен на: " + amount + "\nБаланс на счету после пополнения: " + this.balance);
    }

    public static void addAccount(BankAccount account) {
        bankAccounts.add(account);
    }

    public static BankAccount getAccount(int index) {
        if(index > bankAccounts.size()){
            throw new IndexOutOfBoundsException("Нельзя вызвать элемент списка больший, чем сам список");
        }
        return bankAccounts.get(index);
    }
    /*        - withdraw(double amount) — метод для снятия средств. Если сумма больше текущего баланса, выбросьте пользовательское исключение InsufficientFundsException с сообщением "Недостаточно средств на счете".
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }
        this.balance -= amount;
    }
    /*  - transfer(BankAccount targetAccount, double amount) — метод для перевода денег на другой счет. Используйте методы withdraw и deposit для выполнения операции, и обработайте все возможные исключения. Если targetAccount равен null, выбросьте NullPointerException.*/
    public void transfer(BankAccount targetAccount, double amount) throws InsufficientFundsException {
        if (bankAccounts.stream().noneMatch(acc -> acc.equals(targetAccount))) {
            throw new NullPointerException("Нельзя пересылать деньги на несуществующий счет");
        } else {
            withdraw(amount);
            targetAccount.deposit(amount);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}';
    }
}
