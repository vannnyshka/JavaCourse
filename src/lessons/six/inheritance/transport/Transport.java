package lessons.six.inheritance.transport;

import java.util.Objects;

public class Transport {

    private int power;
    private int maxSpeed;
    private int weight;
    private String mark;


    public Transport() {
    }

    public Transport(int power, int maxSpeed, int weight, String mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }

    public double getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getMark() {
        return mark;
    }

    public double getPowerKV() {
        return this.power * 0.74;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(power, transport.power) == 0 && maxSpeed == transport.maxSpeed && weight == transport.weight && Objects.equals(mark, transport.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, maxSpeed, weight, mark);
    }

    @Override
    public String toString() {
        System.out.println();
        return "Характеристика транспорта" +
                "\n\tМощность: " + power + " л.с/ " + getPowerKV() + " кВ" +
                ",\n\tМаксимальная скорость(км/ч): " + maxSpeed +
                ",\n\tМасса(кг): " + weight +
                ",\n\tМарка: " + mark;
    }
}
