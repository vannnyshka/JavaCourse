package lessons.eight.exceptions.bank;


public class Main {

    public static void main(String[] args) throws InsufficientFundsException {
        /*     Создайте тестовый класс Main:ласс Main:**
        - Попробуйте сделать пополнение счета отрицательной суммой и обработайте исключение.
        - Попробуйте снять сумму, превышающую баланс, и обработайте исключение.
        - Попробуйте перевести сумму с одного счета на другой, обработав возможные исключения.*/

        BankAccount clientOne = new BankAccount("Katya", 300);
        BankAccount clientTwo = new BankAccount("Kolya", 500);

        double sum = -40;

        try {
            clientOne.deposit(sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            clientOne.deposit(Math.abs(sum));
        }

        sum = 500;

        try {
            //здесь ошибка мы получили плохую дату платежа
            clientOne.withdraw(sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            clientOne.withdraw(clientOne.getBalance());
        }


        sum = 400;

        try {
            clientOne.transfer(clientTwo, sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw e;
        }

        BankAccount.addAccount(clientTwo);


        try {
            clientOne.transfer(clientTwo, sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw e;
        }

        sum = -100;

        try {
            clientOne.transfer(clientTwo, sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            clientOne.transfer(clientTwo, Math.abs(sum));
        }


        //IndexOutOfBoundException
        try {
            BankAccount.getAccount(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //NumberFormatException
        try {
            int index = Integer.parseInt("jopa");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }


    }
}
