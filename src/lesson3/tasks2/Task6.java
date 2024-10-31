package lesson3.tasks2;

public class Task6 {
    public static void main(String[] args) {
        /*Напишите программу вывода всех четных чисел от 2 до 100
        включительно */

        //Способ 1
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        //Способ 2
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
