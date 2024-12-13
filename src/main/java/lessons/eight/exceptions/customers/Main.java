package lessons.eight.exceptions.customers;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Пропишите в проекте ConsoleCustomerList все возможные варианты защиты от некорректной работы и её преждевременного завершения.
Программа должна выбрасывать исключения (Exception) при неверном формате
•	команды (количество элементов в команде),
•	номера телефона,
•	email.
*/

public class Main {
    private static String addCommand = "add Василий Петров " +
            "vasily_petrov@gmail.com +79215637722";
    private static String commandExamples = "\t" + addCommand + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static String commandError = "Wrong command! Available command examples: \n" +
            commandExamples;
    private static String helpText = "Command examples:\n" + commandExamples;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();
        for (; ; ) {
            try {
                String command = scanner.nextLine();
                String[] tokens = command.split("\\s+", 2);
                //свич
                if (tokens[0].equals("add")) {
                    executor.addCustomer(tokens[1]);
                } else if (tokens[0].equals("list")) {
                    executor.listCustomers();
                } else if (tokens[0].equals("remove")) {
                    executor.removeCustomer(tokens[1]);
                } else if (tokens[0].equals("count")) {
                    System.out.println("There are " + executor.getCount() + " customers");
                } else if (tokens[0].equals("help")) {
                    System.out.println(helpText);
                } else {
                    System.out.println(commandError);
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}