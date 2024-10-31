package lesson3.tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int amntPos = 0;
        int num;

        System.out.println("Enter three number:");

        /*int countNumber = 0;
          while (countNumber < 3) {
            System.out.println("Enter num: ");
            num = input.nextInt();

            if(num>0){
                amntPos++;
            }
            countNumber++;
        }*/

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter num: ");
            num = input.nextInt();

            if (num > 0) {
                amntPos++;
            }

        }

        System.out.println("Count of positive nums: " + amntPos);
    }

}
