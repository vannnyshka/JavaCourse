package lesson6.linkTasks.t7_cars.vehicles.types;

import lesson6.linkTasks.t7_cars.details.Engine;
import lesson6.linkTasks.t7_cars.persons.professions.Driver;
import lesson6.linkTasks.t7_cars.vehicles.Car;

import java.util.Objects;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String mark, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(mark, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return maxSpeed == sportCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
