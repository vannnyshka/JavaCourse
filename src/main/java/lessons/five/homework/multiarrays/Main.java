package lessons.five.homework.multiarrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
        матрицы).
        1) Почитать сумму четных элементов стоящих на главной диагонали.
        2)Вывести нечетные элементы находящиеся под главной
        диагональю(включительно).
        3)Проверить произведение элементов какой диагонали больше.
        4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
        включительно)
        5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
        строкой и т. д.) */

        int n;
        int sumEvenMainDiag = 0;
        int multMainDiag = 1;
        int multSecDiag = 1;
        int sumEvElAboveSecDiag = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Введите n, где n - размерность матрицы nxn:");

        while (true) {
            n = input.nextInt();

            if (n > 0 && n < 100) {
                break;
            } else {
                System.out.println("Введите нормальное число");
            }
        }

        int[][] nums = new int[n][n];

        System.out.println("Получили матрицу: ");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = (int) (Math.random() * 51);

                if (i == j) {
                    //произведение главное диагонали
                    multMainDiag *= nums[i][j];

                    if (nums[i][j] % 2 == 0) {
                        //сумма четных элементов главной диагонали
                        sumEvenMainDiag += nums[i][j];
                    }
                }

                if ((n - i - 1) == j) {
                    //произведение побочной диагонали
                    multSecDiag *= nums[i][j];
                }

                if ((j < (n - i - 1)) && (nums[i][j] % 2 == 0)) {
                    //сумма четных элементов над побочной диагональю
                    sumEvElAboveSecDiag += nums[i][j];
                }

                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Сумма четных чисел главной диагонали: " + sumEvenMainDiag);

        System.out.println("Четные элементы, находящиеся под главной диагональю(включительно):");


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((i >= j) && (nums[i][j] % 2 == 0)) {
                    System.out.print(nums[i][j] + " ");
                }
            }
        }

        if (multMainDiag > multSecDiag) {
            System.out.println("\nПроизведение " + multMainDiag + " главной диагонали больше проиведения " + multSecDiag + " побочной диагонали");
        } else if (multMainDiag < multSecDiag) {
            System.out.println("\nПроизведение " + multSecDiag + " побочной диагонали больше проиведения " + multMainDiag + " главной диагонали");
        } else {
            System.out.println("\nПроизведения равны: " + multMainDiag + " = " + multSecDiag);
        }

        System.out.println("Сумма четных элементов над побочной диагональю(не включительно): " + sumEvElAboveSecDiag);

        System.out.println("Транспонируемая матрица:");
        int[][] temp = new int[nums.length][nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                temp[j][i] = nums[i][j];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }


    }
}
