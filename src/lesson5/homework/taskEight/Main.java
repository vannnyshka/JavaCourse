package lesson5.homework.taskEight;

public class Main {

    /*Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
    массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
    массива должен равняться отношению элемента из первого массива с i-ым
    индексом к элементу из второго массива с i-ым индексом. Вывести все три
    массива на экран (каждый на отдельной строке), затем вывести количество
    целых элементов в третьем массиве*/

    public static void main(String[] args) {
        int[] numbsOne = new int[10];
        int[] numbsTwo = new int[10];

        float[] numbsTree = new float[10];
        int cInt = 0;

        for (int i = 0; i < 10; i++) {

            numbsOne[i] = (int) (Math.random() * 10);
            numbsTwo[i] = (int) (Math.random() * 10);

            numbsTree[i] = (float) numbsOne[i] / numbsTwo[i];

            if (numbsTree[i] % 1 == 0) {
                cInt++;
            }
        }

        for (int num : numbsOne) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int num : numbsTwo) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (float num : numbsTree) {
            System.out.print(num + " ");
        }

        System.out.println("\nКоличество целых элементов в тертьем массиве: " + cInt);
    }
}
