package lessons.six.inheritance.transport;

import java.util.Objects;

public class CivilAirTransport extends AirTransport {

    private int countPassengers;
    private boolean businessClass;


    public CivilAirTransport(int minRunway, int countPassengers) {
        super(minRunway);
        this.countPassengers = countPassengers;
    }

    public CivilAirTransport(int power, int maxSpeed, int weight, String mark, int minRunway, int lenWing, int countPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, mark, minRunway, lenWing);
        this.countPassengers = countPassengers;
        this.businessClass = businessClass;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public boolean checkFit(int needPassengers) {
        if (countPassengers >= needPassengers) {
            System.out.println("\n" + needPassengers + " ч. вместились в самолет");
            this.countPassengers -= needPassengers;
            System.out.println("Оставшееся количество мест: " + countPassengers);
            return true;
        }
        System.out.println("\nБорт полностью загружен");
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CivilAirTransport that = (CivilAirTransport) o;
        return countPassengers == that.countPassengers && businessClass == that.businessClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countPassengers, businessClass);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n\t\t\tГражданский самолет" +
                "\n\t\t\t\tКоличество пассажиров: " + countPassengers +
                ",\n\t\t\t\tНаличие бизнес класса: " + (businessClass ? "присутсвует" : "отсутсвует");
    }
}
