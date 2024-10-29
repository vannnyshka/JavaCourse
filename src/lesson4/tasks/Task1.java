package lesson4.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //what number?

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num: ");

        int num = input.nextInt();

        int degree = 1; //степень

        while ((Math.abs(num) / Math.pow(10, degree)) > 1) {
            degree++;
        }

        System.out.println("Count of num: " + degree);

        if (num > 0) {
            System.out.println("Positive num");
        } else {
            System.out.println("Negative num");
        }
        //узнвть тернанрным опертором 0 ли это и вывести ноль, после узнать позитивное или негатив
        System.out.println(
                num > 0 ?
                        "Positive num" :
                        num == 0 ?
                                "Zero num" :
                                "Negative num"
        );

        System.out.println(num == 0 ? "Zero num" : num > 0 ? "Positive num" : "Negative num");

        switch (degree) {
            case 1: {
                System.out.println("Single");
                break;
            }
            case 2: {
                System.out.println("Two");
                break;
            }
            case 3:{
                System.out.println("Three");
                break;
            }
            default: System.out.println(degree+" count.");
        }

    }
}
