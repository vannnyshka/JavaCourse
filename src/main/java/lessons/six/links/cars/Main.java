package lessons.six.links.cars;

import lessons.six.links.cars.details.Engine;
import lessons.six.links.cars.persons.professions.Driver;
import lessons.six.links.cars.vehicles.Car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Opel", "Simple", 3000, new Driver("Белова Антонина", 23, 1), new Engine(300, "Витьба"));
        System.out.println(car);

    }

}
