package lesson3.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");

        int a = input.nextInt();

        System.out.println("Enter b: ");

        int b = input.nextInt();

        System.out.println(
                b == a ?
                        b :
                        a > b ?
                                a : b
        );

        //or

        System.out.println(Math.max(a, b));

    }
}
