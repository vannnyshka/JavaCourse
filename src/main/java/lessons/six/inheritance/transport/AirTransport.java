package lessons.six.inheritance.transport;

import java.util.Objects;

public class AirTransport extends Transport {

    private int minRunway;
    private int lenWing;

    public AirTransport(int minRunway) {
        this.minRunway = minRunway;
    }

    public AirTransport(int power, int maxSpeed, int weight, String mark, int minRunway, int lenWing) {
        super(power, maxSpeed, weight, mark);
        this.minRunway = minRunway;
        this.lenWing = lenWing;
    }


    public int getMinRunway() {
        return minRunway;
    }

    public int getLenWing() {
        return lenWing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AirTransport that = (AirTransport) o;
        return minRunway == that.minRunway && lenWing == that.lenWing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minRunway, lenWing);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n\t\tВоздушный траспорт" +
                "\n\t\t\tРасмах крыльев(м): " + lenWing +
                ",\n\t\t\tМинимальная длина взлетно-посадочной полосы: " + minRunway;
    }
}
