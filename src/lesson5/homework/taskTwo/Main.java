package lesson5.homework.taskTwo;

public class Main {
    public static void main(String[] args) {

        /*Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
        порядке (99 97 95 93 … 7 5 3 1).*/

        int[] numbs = new int[50];
        int j = 1;

        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = j;
            System.out.print(numbs[i] + " ");
            j += 2;
        }


        System.out.println();

        for (int i = numbs.length - 1; i >= 0; i--) {
            System.out.print(numbs[i] + " ");
        }
    }
}
