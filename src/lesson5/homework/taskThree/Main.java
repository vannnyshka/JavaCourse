package lesson5.homework.taskThree;

public class Main {

    /*Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
    массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
    это количество на экран на отдельной строке*/

    public static void main(String[] args) {
        int[] numbs = new int[15];
        int cEven = 0;

        //Min + (int)(Math.random() * ((Max - Min) + 1))
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = (int) (Math.random() * 100);
            if (numbs[i] % 2 == 0) {
                cEven++;
            }
            System.out.print(numbs[i] + " ");
        }


        System.out.println("\nЧетных чисел: " + cEven);
        System.out.println("Нечетных чисел: "+ (numbs.length-cEven));
    }
}
