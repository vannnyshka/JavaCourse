package lessons.four.regulars.fio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Принимать с консоли ФИО через пробелы и разделить, чтобы красиво вывести. Сделать устойчивой к ошибкам*/

        Scanner input = new Scanner(System.in);

        String name = "Зданевич Анна Валерьевна";
        String phone = "+7954-8-32-9125";

//        System.out.println("Введие ФИО в формате Фамилия Имя Отчество");
//
//        name = input.nextLine();
//
//        System.out.println("Введие номер телефона");
//
//        phone = input.nextLine();

        Person person = new Person(name, phone);
        System.out.println(person);


    }
}
