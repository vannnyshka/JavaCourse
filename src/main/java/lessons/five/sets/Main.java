package lessons.five.sets;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        boolean exLoop = true;
        Set<String> emails = new TreeSet<>();

        while (exLoop) {

            String action;

            Scanner input = new Scanner(System.in);

            System.out.println("Напишите команду, которую вы желаете выполнить:");
            System.out.println("LIST - вывести все адреса");
            System.out.println("ADD — добавить адрес электронной почты");
            System.out.println("EXIT - выход из программы");


            action = input.nextLine();

            action = action.trim();

            switch (action) {

                case "LIST":
                    printEmails(emails);
                    break;

                case "ADD":
                    addEmail(emails);
                    break;


                case "EXIT":
                    exLoop = false;
                    break;

                default:
                    System.out.println("Вы ввели неверную команду. Попробуйте еще раз.\n");

            }

        }

        System.out.println("Работа программы завершена.");
    }

    public static void printEmails(Set<String> emails) {
        for (String email : emails) {
            System.out.println(email + ", ");
        }

        System.out.println();
    }


    public static void addEmail(Set<String> emails) {
        System.out.println("\nВведите команду в формате:\nADD [your_email]");
        String addCommand;

        Scanner input = new Scanner(System.in);

        addCommand = input.nextLine();
        addCommand = addCommand.trim();

        Pattern pattern = Pattern.compile("^ADD\\s+([a-zA-Z0-9_.]+@[a-zA-Z]+\\.[a-zA-Z]{2,})$");
        Matcher matcher = pattern.matcher(addCommand);


        if (matcher.find()) {

            String email = matcher.group(1);

            if (!emails.contains(email)) {

                emails.add(email);
                System.out.println(email + " был успешно добавлен в список.");

            } else {
                System.out.println("Такой email уже существует.");
            }
        } else {
            System.out.println("Вы ввели неверную команду или email некорректен.");
        }

        System.out.println();
    }


}
