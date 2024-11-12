package lesson5.homework.taskFive;

public class Main {

    /*Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    выведите массивы на экран в двух отдельных строках. Посчитайте среднее
    арифметическое элементов каждого массива и сообщите, для какого из
    массивов это значение оказалось больше (либо сообщите, что их средние
    арифметические равны)*/

    public static void main(String[] args) {
        int[] numbsOne = new int[5];
        int sumOne = 0;
        float avgOne;

        int[] numsTwo = new int[5];
        int sumTwo = 0;
        float avgTwo;

        for (int i = 0; i < numbsOne.length; i++) {
            numbsOne[i] = (int) (Math.random() * 6);
            numsTwo[i] = (int) (Math.random() * 6);

            sumOne += numbsOne[i];
            sumTwo += numsTwo[i];
        }

        for (int num : numbsOne) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int num : numsTwo) {
            System.out.print(num + " ");
        }

        avgOne = (float) sumOne / 5;
        avgTwo = (float) sumTwo / 5;

        System.out.println();

        if (avgOne > avgTwo) {
            System.out.println("avgOne: " + avgOne + " > " + "avgTwo: " + avgTwo);
        } else if (avgOne < avgTwo) {
            System.out.println("avgOne: " + avgOne + " < " + "avgTwo: " + avgTwo);
        } else {
            System.out.println("avgOne: " + avgOne + " = " + "avgTwo: " + avgTwo);
        }
    }
}
