package lessons.nine.files.task.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {

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
    public String toString() {
        return "Car: " +
                "марка - " + mark +
                ", скорость - " + speed +
                ", цена - " + price +
                '.';
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
}
