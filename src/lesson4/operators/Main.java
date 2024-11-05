package lesson4.operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Сделай через классы
        //Вы доставляете гуманитарную помощь в ящиках одинакового размера.
        // У вас есть грузовики и контейнеры. В каждый грузовик помещается максимум 12 контейнеров.
        // В каждый контейнер — не более 27 ящиков.
        // Ящики, контейнеры и грузовики пронумерованы.
        //Напишите программу, которая распределит ящики по контейнерам и грузовикам в зависимости от их количества.
        // Программа должна выводить необходимое для этого число грузовиков и контейнеров.

        /*грузовики, контейнеры, ящики. В одном грузовике может помещаться 12 контейнеров
        В одном контейнере - 27 ящиков. На вход количество ящиков - номера грузовиков, номера контейнеров, номера ящиков*/

        int countBox;

        int originCountBox = 5;
        int originCountConteiner = 3;

        //System.out.println(1%5);  ??? --1

        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество ящиков: ");

        countBox = input.nextInt();

        int countConteiner = 1;
        int countTruck = 1;
//        System.out.println("Грузовик "+countTruck);
//        System.out.println("\tКонтейнер "+countConteiner);

        int i = 1;
        while (i <= countBox) {
            if (i % (originCountConteiner * originCountBox) == 1) {
                System.out.println("Грузовик " + countTruck);
            }
            if (i % originCountBox == 1) {
                System.out.println("\tКонтейнер " + countConteiner);
            }
            System.out.println("\t\tЯщик " + i);
            if (i % originCountBox == 0) {
                countConteiner += 1;
                if (countConteiner % originCountConteiner == 0) {
                    countTruck += 1;
                }
            }
            i++;
        }

    }
}
