package lesson3.tasks2;

public class Task7 {
    public static void main(String[] args) {
        /*Напишите программу, определяющую сумму всех нечетных чисел от 1
            до 99*/

        int result = 0;

        //Способ 1
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                result += i;
            }
        }

        System.out.println(result);

        //Способ 2 - реккурентная формула; арифметическая прогрессия.

        result = (1 + 99) * 50 / 2;

        System.out.println(result);

        result = 0;

        //Способ 3
        for (int i = 1; i <= 99; i += 2) {
            result += i;
        }

        System.out.println(result);

    }
}
