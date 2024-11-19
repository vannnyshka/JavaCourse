package lessons.three.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");

        int a = input.nextInt();

        System.out.println("Enter b: ");

        int b = input.nextInt();

        System.out.println("Enter c: ");
        int c = input.nextInt();

        if (((a + b) < c) || ((a + c) < b) || ((c + b) < a)) {
            System.out.println("It doesn't exist");
        } else {
            System.out.println("Horaaay!!! It exists!!!");
        }
    }
}
