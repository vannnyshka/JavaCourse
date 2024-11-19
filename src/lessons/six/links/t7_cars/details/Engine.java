package lessons.six.links.t7_cars.details;

import java.util.Objects;

public class Engine {

    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && Objects.equals(manufacturer, engine.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, manufacturer);
    }

    @Override
    public String toString() {
        return "\n\tДвигатель:" +
                "\n\t\tМощность: " + power +
                ",\n\t\tПроизводитель: " + manufacturer;
    }
}
