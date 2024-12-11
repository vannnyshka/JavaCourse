package lessons.eight.exceptions.car;

public class Main {
    public static void main(String[] args) {
        /*1) Создать собственное исключение- Создать класс Car c полями (марка, скорость, цена), конструкторы (с
параметрами и default) гетеры-сетеры.
 Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
генерируете случайное число от 0 до 20, если полученное число оказалось
четным, то выбрасываете созданное ранее вами исключение и передаете его к
месту откуда вызывали метод старт. Если все хорошо и исключение не
вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
завелся.
 В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете
исключение которое может вылететь при старте автомобиля*/

        Car bmw = new Car("BMW x4", 250, 10000);
        Car porsche = new Car("Porsche", 300, 100000);
        Car opel = new Car("Opel", 180, 4000);

        try{
            bmw.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            porsche.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            opel.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Запуск завершен");

    }
}
