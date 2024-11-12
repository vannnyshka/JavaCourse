package lesson5.homework.taskFour;

public class Main {
    public static void main(String[] args) {

        /*Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
        массив на экран в строку. Замените каждый элемент с нечётным индексом на
        ноль. Снова выведете массив на экран на отдельной строке*/

        int[] numbs = new int[20];

        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = (int)(Math.random() * 21);
            System.out.print(numbs[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numbs.length; i++) {

            if (i % 2 == 1) {
                numbs[i] = 0;
            }

            System.out.print(numbs[i] + " ");
        }

    }
}
