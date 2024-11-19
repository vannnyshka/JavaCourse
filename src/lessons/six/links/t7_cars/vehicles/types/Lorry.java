package lessons.six.links.t7_cars.vehicles.types;

import lessons.six.links.t7_cars.details.Engine;
import lessons.six.links.t7_cars.persons.professions.Driver;
import lessons.six.links.t7_cars.vehicles.Car;

import java.util.Objects;

class Lorry extends Car {

    private int loadCapacity;

    public Lorry(String mark, String carClass, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(mark, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return loadCapacity == lorry.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
