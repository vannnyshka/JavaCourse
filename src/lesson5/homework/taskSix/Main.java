package lesson5.homework.taskSix;

public class Main {

    /*Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
    на экран в строку. Определить и вывести на экран сообщение о том, является ли
    массив строго возрастающей последовательностью*/

    public static void main(String[] args) {
        int[] numbs = new int[4];
        boolean check = true;

        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = (int) (Math.random()*11);
            System.out.print(numbs[i] + " ");
        }

        for (int i = 1; i < numbs.length; i++) {
            if (numbs[i] <= numbs[i - 1]) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("\nПрогрессия строго возрастающая");
        } else {
            System.out.println("\nПрогрессия НЕ строго возрастающая");
        }
    }
}
