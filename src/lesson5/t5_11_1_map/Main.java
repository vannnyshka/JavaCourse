package lesson5.t5_11_1_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        boolean exLoop = true;
        //Выбираю ключ - значение: ФИО - номер
        //Минус в том, что имен может быть несколько одинаковых, а телефон будет всегда уникальным
        //Плюс в том, что мы можем отсортировать людей в алфовитном порядке

        TreeMap<String, String> contacts = new TreeMap<>();

        while (exLoop) {

            String action;

            Scanner input = new Scanner(System.in);

            System.out.println("Напишите команду, которую вы желаете выполнить:");
            System.out.println("LIST - вывести телефонную книгу");
            System.out.println("ADD — добавить новый контакт");
            System.out.println("EXIT - выход из программы");

            action = input.nextLine();

            action = action.trim();

            switch (action) {

                case "LIST":
                    printContacts(contacts);
                    break;

                case "ADD":
                    addContact(contacts);
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


    public static void printContacts(Map<String, String> contacts) {
        for (String contact : contacts.keySet()) {
            System.out.println(contact + " - " + contacts.get(contact));
        }
        System.out.println();
    }


    public static void addContact(Map<String, String> contacts) {
        System.out.println("\nВведите имя или номер");
        String inf;

        Scanner input = new Scanner(System.in);

        inf = input.nextLine();

        String phone = inf.replaceAll("[^\\d]", "");
        String fio = inf.trim();

        //() скобки обозначают группу захвата, которую мы можем выделить в mather.group, если мы хотим просто выделить выбор
        //7|8 - использовать для этого надо (?:7|8)
        Pattern pattern = Pattern.compile("(^[78]\\d{10}$|^\\d{10}$)");
        Matcher matcher = pattern.matcher(phone);


        if (matcher.find()) {

            phone = matcher.group(1);
            //System.out.println("НОМЕР: " + phone);

            if (phone.length() == 10) {
                phone = '7' + phone;
            } else {
                phone = '7' + phone.substring(1);
            }

            //System.out.println("НОМЕР: " + phone);

            addPhone(contacts, phone);


        } else {
            pattern = Pattern.compile("(^[А-ЯЁ][а-яё]+\\s[А-ЯЁ][а-яё]+\\s[А-ЯЁ][а-яё]+$)");
            matcher = pattern.matcher(fio);

            if (matcher.find()) {

                fio = matcher.group(1);
                //System.out.println("fio: " + fio);
                addFio(contacts, fio);

            } else {
                System.out.println("ФИО или номер некорректен. Попробуйте еще раз.");
                System.out.println();
            }
        }
    }

    public static boolean checkPhone(Map<String, String> contacts, String phone) {
        boolean exists = false;
        for (String contact : contacts.keySet()) {
            if (contacts.get(contact).equals(phone)) {
                exists = true;
                break;
            }
        }

        return exists;
    }

    public static void addFio(Map<String, String> contacts, String fio) {

        if (!contacts.containsKey(fio)) {

            System.out.println("Введите номер контакта:");

            Scanner input = new Scanner(System.in);

            String phone = input.nextLine();

            phone = phone.replaceAll("[^\\d]", "");;

            Pattern pattern = Pattern.compile("^7|8\\d{11}$|^\\d{10}$");
            Matcher matcher = pattern.matcher(phone);

            if (matcher.find()) {

                if (phone.length() == 10) {
                    phone = '7' + phone;
                } else {
                    phone = '7' + phone.substring(1);
                }

                if (checkPhone(contacts, phone)) {
                    System.out.println("Такой номер уже существует. Попробуйте еще раз.");
                } else {
                    contacts.put(fio, phone);
                    System.out.println("Контакт успешно добавлен.");
                }

            } else {
                System.out.println("Вы ввели неверный номер телефона. Попробуйте еще раз.");
            }


        } else {
            System.out.println("Такое ФИО уже сущетсвует.");
        }
        System.out.println();
    }

    public static void addPhone(Map<String, String> contacts, String phone) {

        if (!checkPhone(contacts, phone)) {

            System.out.println("Введите ФИО контакта в формате Фамилия Имя Отчество: ");

            Scanner input = new Scanner(System.in);

            String fio = input.nextLine();

            fio = fio.trim();

            Pattern pattern = Pattern.compile("^[А-ЯЁ][а-яё]+\\s[А-ЯЁ][а-яё]+\\s[А-ЯЁ][а-яё]+$");
            Matcher matcher = pattern.matcher(fio);

            if (matcher.find()) {

                if (contacts.containsKey(fio)) {
                    System.out.println("Такое имя уже существует. Попробуйте еще раз.");
                } else {
                    contacts.put(fio, phone);
                    System.out.println("Контакт успешно добавлен.");
                }

            } else {
                System.out.println("Вы ввели неверное ФИО. Попробуйте еще раз.");
            }


        } else {
            System.out.println("Такой номер уже сущетсвует.");
        }
        System.out.println();
    }


}
