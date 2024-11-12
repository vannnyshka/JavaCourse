package lesson5.homework.taskTen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
        переменную n. Если пользователь ввёл не подходящее число, то программа
        должна выдать соответствующее сообщение. Создать массив из n случайных
        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
        только из чётных элементов первого массива, если они там есть, и вывести его
        на экран*/

        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число элементов массива больше 3");

        while (true) {
            n = input.nextInt();

            if (n > 3) {
                break;
            } else {
                System.out.println("Вы ввели неверное число.");
            }
        }

        int[] numbs = new int[n];
        int[] numbsTwo = new int[n];
        int j = 0;

        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = (int) (Math.random() * (n + 1));

            if (numbs[i] % 2 == 0) {
                numbsTwo[j] = numbs[i];
                j++;
            }

            System.out.print(numbs[i] + " ");
        }

        System.out.println();

        for (int num : numbsTwo) {
            System.out.print(num + " ");
        }

    }
}
