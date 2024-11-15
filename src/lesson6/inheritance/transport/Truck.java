package lesson6.inheritance.transport;

import java.util.Objects;

public class Truck extends GroundTransport {

    private int loadCapacity;

    public Truck(int power, int maxSpeed, int weight, String mark, int countWheel, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, mark, countWheel, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean checkFit(int needCapacity) {
        if (loadCapacity >= needCapacity) {
            System.out.println("\nГрузовик загружен");
            this.loadCapacity -= needCapacity;
            return true;
        }
        System.out.println("\nВам нужен грузовик побольше");
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n\t\t\tГрузовик" +
                "\n\t\t\t\tГрузоподъемность(т): " + loadCapacity;
    }
}
