package lessons.eight.exceptions.car;

import java.util.Objects;

public class Car {

    private String mark;
    private int speed;
    private double price;

    public Car(String mark, int speed, double price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && Double.compare(price, car.price) == 0 && Objects.equals(mark, car.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, speed, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    public void start() throws CarIsNotReadyToStart {
        int start = (int) (Math.random() * 21);
        if (start % 2 == 0) {
            throw new CarIsNotReadyToStart("Автомобиль " + this.mark + " НЕ завелся");
        } else {
            System.out.println("Автомобиль "+ this.mark +" завелся!");
        }

    }
}
