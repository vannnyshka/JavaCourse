package lessons.nine.files.task.serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        /* Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
            сериализации произвести обратный процесс*/

        /*Сериализация представляет процесс записи состояния объекта в поток,
            соответственно процесс извлечения или восстановления состояния объекта из
            потока называется десериализацией.*/

        String path = "src/main/resources/nine/files/serialization/text.txt";

        System.out.println("Сериализация началась...");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(new Car("BMW", 200, 10000.00));
            oos.writeObject(new Car("OPEL", 150, 4000.00));
            oos.writeObject(new Car("RENO", 190, 7000.00));
            System.out.println("Объекты успешно сериализованы");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println("Десериализация началась...");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));


            while (true) {
                try {
                    Car car = (Car) ois.readObject();
                    System.out.println(car);
                } catch (EOFException e) {
                    break;
                }
            }

            System.out.println("Объекты успешно десериализованы");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
