package lesson3.tasks2;

public class Task5 {

    public static void main(String[] args) {
        /*Напишите программу печати таблицы перевода расстояний из дюймов в
        сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " дюйм = " + i * 2.54 + " см.");
        }
    }
}
