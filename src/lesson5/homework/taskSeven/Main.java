package lesson5.homework.taskSeven;

public class Main {
    public static void main(String[] args) {

        /*Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
        какой элемент является в этом массиве максимальным и сообщите индекс его
        последнего вхождения в массив*/

        int[] numbs = new int[12];
        int maxNum = numbs[0];
        int lastIndex = 0;

        // не согласна с решением нужно за один цикл всё
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = (int) (Math.random() * 16);
            System.out.print(numbs[i] + " ");
            if (numbs[i] >= maxNum) {
                maxNum = numbs[i];
                lastIndex = i;
            }
        }


        System.out.println("Максимальный элемент массива: " + maxNum);
        System.out.println("Индекс последнего его вхождения: " + lastIndex);

    }
}
