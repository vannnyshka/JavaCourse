package lessons.six.links.t7_cars;

import lessons.six.links.t7_cars.details.Engine;
import lessons.six.links.t7_cars.persons.professions.Driver;
import lessons.six.links.t7_cars.vehicles.Car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Opel", "Simple", 3000, new Driver("Белова Антонина", 23, 1), new Engine(300, "Витьба"));
        System.out.println(car);

    }

}
