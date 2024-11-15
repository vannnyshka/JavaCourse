package lesson6.inheritance.transport;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(100, 150, 1500, "BWM", 4, 10, "Какой-то тип", 5);

        System.out.println(car);
        System.out.println("\nКакое расстояние машина проедет за 2.5 часа:");
        System.out.println(car.calcDistance(2.5));


        Truck truck = new Truck(300, 100, 3000, "Mercedes", 4, 15, 5);

        System.out.println(truck);
        System.out.println("\nВместиться ли в этот грузовик 5 тонн: " + (truck.checkFit(5) ? "вместится" : "не сместится"));


        CivilAirTransport plane = new CivilAirTransport(1000, 330, 10000, "Boing", 3000, 30, 140, true);

        System.out.println(plane);
        plane.checkFit(54);

        MilitaryAirTransport militaryPlane = new MilitaryAirTransport(1500, 400, 5000, "Scania", 3300, 30, 2, false);

        System.out.println(militaryPlane);
        militaryPlane.shot();
        militaryPlane.shot();
        militaryPlane.shot();

        militaryPlane.catapult();
    }
}
