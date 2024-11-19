package lessons.three.tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of programmers: ");

        int prgrms = input.nextInt();

        int degree = 1;

        if (prgrms >= 0) {

            while (prgrms / Math.pow(10, degree) > 10) {
                degree++;
            }


            int div = (int) (prgrms / Math.pow(10, degree));


            if (div != 1) {
                if ((prgrms % 10 == 0) || (prgrms % 10 > 5)) {
                    System.out.println(prgrms + " программистов.");
                } else if (prgrms % 10 == 1) {
                    System.out.println(prgrms + " программист.");
                } else {
                    System.out.println(prgrms + " программиста.");
                }
            } else {

                System.out.println(prgrms + " программистов.");
            }


        } else {
            System.out.println("You are fool!!!!");
        }

    }
}
