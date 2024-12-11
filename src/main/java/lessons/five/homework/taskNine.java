package lessons.five.homework;

import java.util.Scanner;

public class taskNine {

    /*Пользователь должен указать с клавиатуры положительное число, а
    программа должна создать массив указанного размера из случайных целых
    чисел из [0;15] и вывести его на экран в строку. После этого программа должна
    определить и сообщить пользователю о том, сумма какой половины массива
    больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
    пользователь введёт неподходящее число, то выдать соответствующее
    сообщение*/

    public static void main(String[] args) {

        int cValues;
        int sumfPart = 0;
        int sumsPart = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите число элементов массива: ");

        while (true) {
            cValues = input.nextInt();

            if (cValues > 0 && cValues < 100) {
                break;
            } else {
                System.out.println("Введите НОРМАЛЬНОЕ число элементов массива");
            }
        }

        int[] nums = new int[cValues];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 16);
            System.out.print(nums[i] + " ");
        }

        for (int i = 0; i < nums.length / 2; i++) {
            sumfPart += nums[i];
            sumsPart += nums[nums.length - 1 - i];
        }

        System.out.println();

        if (sumfPart > sumsPart) {
            System.out.println("Сумма " + sumfPart + " первой половины массива больше, чем сумма второй: " + sumsPart);
        } else if (sumfPart < sumsPart) {
            System.out.println("Сумма " + sumfPart + " первой половины массива меньше, чем сумма второй: " + sumsPart);
        } else {
            System.out.println(" Сумма " + sumfPart + " = " + sumsPart);
        }


    }
}
