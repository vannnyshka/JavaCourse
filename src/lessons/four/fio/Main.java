package lessons.four.fio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Принимать с консоли ФИО через пробелы и разделить, чтобы красиво вывести. Сделать устойчивой к ошибкам*/

        String name = "Зданевич Анна Валерьевна";

        System.out.println("Введие ФИО в формате Фамилия Имя Отчество");

        Scanner input = new Scanner(System.in);

        name = input.nextLine();

        Person person = new Person(name);
        System.out.println(person);




    }
}
