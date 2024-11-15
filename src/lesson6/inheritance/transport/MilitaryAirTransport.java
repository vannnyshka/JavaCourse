package lesson6.inheritance.transport;

import java.util.Objects;

public class MilitaryAirTransport extends AirTransport {

    private boolean ejectionSystem;
    private int countMissiles;

    public MilitaryAirTransport(int minRunway, boolean ejectionSystem) {
        super(minRunway);
        this.ejectionSystem = ejectionSystem;
    }

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String mark, int minRunway, int lenWing, int countMissiles, boolean ejectionSystem) {
        super(power, maxSpeed, weight, mark, minRunway, lenWing);
        this.ejectionSystem = ejectionSystem;
        this.countMissiles = countMissiles;
    }

    public void catapult() {
        if (this.ejectionSystem) {
            System.out.println("\nКатапультирование прошло успешно");
        } else {
            System.out.println("\nУ вас нет такой системы. Здоровья погибшим");
        }
    }

    public boolean shot() {
        if (this.countMissiles > 0) {
            System.out.println("\nРакета пошла…");
            this.countMissiles--;
            System.out.println("Оставшееся количество ракет: " + this.countMissiles);
            return true;
        }
        System.out.println("\nБоеприпасы отсутствуют");
        return false;
    }


    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public int getCountMissiles() {
        return countMissiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryAirTransport that = (MilitaryAirTransport) o;
        return ejectionSystem == that.ejectionSystem && countMissiles == that.countMissiles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ejectionSystem, countMissiles);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n\t\t\tВоенный самолет" +
                "\n\t\t\t\tКоличество ракет на борту: " + countMissiles +
                ",\n\t\t\t\tНаличие системы катапультирования: " + (ejectionSystem ? "присутсвует" : "отсутсвует");
    }
}
