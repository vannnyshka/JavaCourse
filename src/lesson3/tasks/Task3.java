package lesson3.tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num: ");

        int num = input.nextInt();

        System.out.println(
                num == 0 ?
                        10 :
                        num > 0 ?
                                num + 1 :
                                num - 2);
    }

}
