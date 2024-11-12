package lesson5.homework.taskOne;

import java.util.Calendar;
import java.util.Date;

public class Main {

    /*Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
    массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
    затем в столбик (отделяя один элемент от другого началом новой строки). Перед
    созданием массива подумайте, какого он будет размера*/

    public static void main(String[] args) {
        int[] nums = new int[10];
        int j = 2;

        long ms = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = j;
            System.out.print(nums[i] + " ");
            j += 2;
        }


        System.out.println();

        for (int num : nums) {
            System.out.println(num);
        }

    }
}
