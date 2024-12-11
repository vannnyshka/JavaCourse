package lessons.six.inheritance.transport;

import java.util.Objects;

public class GroundTransport extends Transport {

    private int countWheel;
    private int fuelConsumption;


    public GroundTransport(int power, int maxSpeed, int weight, String mark, int countWheel, int fuelConsumption) {
        super(power, maxSpeed, weight, mark);
        this.countWheel = countWheel;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountWheel() {
        return countWheel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GroundTransport that = (GroundTransport) o;
        return countWheel == that.countWheel && fuelConsumption == that.fuelConsumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countWheel, fuelConsumption);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n\t\tНаземный траспорт" +
                "\n\t\t\tКоличество колев: " + countWheel + " л.с/ " + getPowerKV() + " кВ" +
                ",\n\t\t\tРасход топлив: " + fuelConsumption;
    }
}
