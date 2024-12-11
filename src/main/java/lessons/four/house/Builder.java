package lessons.four.house;

public class Builder {

    public static void main(String[] args) {
        //В названии переменных не используем цифры лучше appartmentOne
        Door door = new Door(false);
        Light light = new Light(false);
        Window window = new Window(false);

        Appartment appartment = new Appartment(door, light, window, false, 25);

        appartment.openDoor();

        appartment.buildAppartment();

        appartment.closeDoor();

        appartment.openDoor();

        appartment.closeDoor();

        appartment.openWindow();

        appartment.turnOnLight();


        System.out.println(appartment);

    }
}
