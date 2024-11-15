package lesson5.t5_5_1_reverse;

public class Main {
    public static void main(String[] args) {
        /*Создайте массив из мнемонической фразы:
        Каждый охотник желает знать, где сидит фазан*/

        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] words = text.split(",?\\s+");

        for (String wordsValue : words) {
            System.out.println(wordsValue);
        }

        /*Напишите код, который меняет порядок расположения элементов внутри массива на обратный
        Первоначальный массив: [“a”, “b”, “c”, “d”].*/

        char[] nums = {'a', 'b', 'c', 'd','e'};
        char temp;

        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
//такое имя у меременной как будто в примитивном типе чар есть какое-то значение тут обычно пишут
        //for (String word : words)
        //for (char char : nums)
        for (char num : nums) {
            System.out.println(num);
        }

    }
}
