package lesson6.linkTasks.t7_cars.vehicles;

import lesson6.linkTasks.t7_cars.details.Engine;
import lesson6.linkTasks.t7_cars.persons.professions.Driver;

import java.util.Objects;

public class Car {

    private String mark;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String mark, String carClass, int weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворт направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight && Objects.equals(mark, car.mark) && Objects.equals(carClass, car.carClass) && Objects.equals(driver, car.driver) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, carClass, weight, driver, engine);
    }

    @Override
    public String toString() {
        return "Характеристики машины" +
                "\n\tМарка: " + mark +
                ",\n\tМасса(кг): " + weight
                 + driver
                 + engine;
    }
}
