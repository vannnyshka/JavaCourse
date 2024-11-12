package lesson5.t5_7_1_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        boolean exLoop = true;
        List<String> todo = new ArrayList<>();

        while (exLoop) {

            String action;

            Scanner input = new Scanner(System.in);

            System.out.println("Напишите команду, которую вы желаете выполнить:");
            System.out.println("LIST - выводит дела с их порядковыми номерами");
            System.out.println("ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер");
            System.out.println("EDIT — заменяет дело с указанным номером");
            System.out.println("DELETE — удаляет");
            System.out.println("EXIT - выход из программы");


            action = input.nextLine();

            action = action.trim();

            switch (action) {

                case "LIST":
                    printList(todo);
                    break;

                case "ADD":
                    addList(todo);
                    break;

                case "EDIT":
                    editList(todo);
                    break;

                case "DELETE":
                    deleteList(todo);
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

    public static void printList(List<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + " - " + arrayList.get(i));
        }

        System.out.println();
    }

    public static Matcher getMatcher(String regex) {
        String addCommand;

        Scanner input = new Scanner(System.in);

        addCommand = input.nextLine();
        addCommand = addCommand.trim();

        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(addCommand);
    }

    public static void deleteList(List<String> arrayList) {
        System.out.println("\nВведите команду в формате:\nDELETE [todo_number]");

        Matcher matcher = getMatcher("^DELETE\\s+(\\d+)$");

        if (matcher.find()) {

            String number = matcher.group(1);

            int index = Integer.parseInt(number);

            if (index > arrayList.size() - 1) {
                System.out.println("Не может быть удалено несуществующее дело.");
            } else {
                arrayList.remove(index);
                System.out.println("Дело №" + index + " было успешно удалено.");
            }

        } else {
            System.out.println("Вы ввели неверную команду.");
        }

        System.out.println();
    }

    public static void addList(List<String> arrayList) {
        System.out.println("\nВведите команду в формате:\nADD [your_todo]\nили\nADD [todo_number] [your_todo]");

        Matcher matcher = getMatcher("^ADD\\s+(\\d+\\s+)?(.*)$");

        if (matcher.find()) {

            String number = matcher.group(1);
            String text = matcher.group(2);

            if (number != null) {

                int index = Integer.parseInt(number.trim());


                if (index > arrayList.size() - 1) {
                    arrayList.add(text);
                    System.out.println("Дело было успешно добавлено в конец списка.");
                } else {
                    arrayList.add(index, text);
                    System.out.println("Дело №" + index + " было успешно добавлено в список.");
                }

            } else {
                arrayList.add(text);
                System.out.println("Дело было успешно добавлено в список.");
            }
        } else {
            System.out.println("Вы ввели неверную команду.");
        }

        System.out.println();
    }


    public static void editList(List<String> arrayList) {


        System.out.println("\nВведите команду в формате:\nEDIT [todo_number] [edit_todo]");


        Matcher matcher = getMatcher("^EDIT\\s+(\\d+)\\s+(.*)$");

        if (matcher.find()) {

            String number = matcher.group(1);
            String text = matcher.group(2);

            int index = Integer.parseInt(number.trim());


            if (index > arrayList.size() - 1) {
                System.out.println("Не может быть отредактировано несуществующее дело.");
            } else {
                arrayList.remove(index);
                arrayList.add(index, text);
                System.out.println("Дело №" + index + " было успешно отредактировано.");
            }

        } else {
            System.out.println("Вы ввели неверную команду.");
        }

        System.out.println();
    }
}
