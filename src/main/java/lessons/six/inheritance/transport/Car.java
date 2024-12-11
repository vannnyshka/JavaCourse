package lessons.six.inheritance.transport;

import java.util.Objects;

public class Car extends GroundTransport {

    private String bodyType;
    private int countPassengers;


    public Car(int power, int maxSpeed, int weight, String mark, int countWheel, int fuelConsumption, String bodyType, int countPassengers) {
        super(power, maxSpeed, weight, mark, countWheel, fuelConsumption);
        this.bodyType = bodyType;
        this.countPassengers = countPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    private double getAmountFuel(double distance) {
        return distance / 100 * getFuelConsumption();
    }

    public String calcDistance(double time) {

        double distance = getMaxSpeed() * time;

        return "\nРезультат работы метода должен вывести такую строчку: \n" +
                "За время " + time + " ч, автомобиль " + getMark() + " \n" +
                "двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч \n" +
                "проедет " + distance + " км  и израсходует " + getAmountFuel(distance) + " литров топлива. ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return countPassengers == car.countPassengers && Objects.equals(bodyType, car.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType, countPassengers);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n\t\t\tМашина" +
                "\n\t\t\t\tТип кузова: " + bodyType +
                ",\n\t\t\t\tКоличество пассажиров: " + countPassengers;
    }


}
