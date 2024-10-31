package lesson3.tasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amntPos = 0, amntNeg = 0, num;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter num: ");
            num = input.nextInt();

            if (num > 0) {
                amntPos++;
            } else if (num != 0) {
                amntNeg++;
            }
        }

        System.out.println("Count of negative num: " + amntNeg + ". Count of positive num: " + amntPos);
    }
}
