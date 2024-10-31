package lesson3.tasks2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*Составьте программу, вычисляющую A*B, не пользуясь операцией
        умножения*/

        Scanner input = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = input.nextInt();

        System.out.println("Enter B: ");
        int b = input.nextInt();

        int result = 0;

        for (int i = 0; i < b; i++) {
            result += a;
        }

        System.out.println(result);

    }
}
