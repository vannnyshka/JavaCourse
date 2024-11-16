package lesson6.linkTasks.t5_recursion;

public class Recursion {

    public static void main(String[] args) {

        int a = 10;
        int b = 19;

        printNumbs(a, b);


    }

    public static void printNumbs(int a, int b) {

        System.out.println(a);

        if (a == b) {
            return;
        }

        if (a > b) {
            printNumbs(a - 1, b);
            return;
        }

        printNumbs(a + 1, b);

    }
}
