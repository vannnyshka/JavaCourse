package lesson4.tasks;

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

        if ((a + b) < c) {
            System.out.println("It doesn't exist");
        } else if ((a + c) < b) {
            System.out.println("It doesn't exist");
        } else if ((c + b) < a) {
            System.out.println("It doesn't exist");
        } else {
            System.out.println("Horaaay!!! It exists!!!");
        }
    }
}
