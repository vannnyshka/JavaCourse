package lessons.eight.exceptions.car;

public class CarIsNotReadyToStart extends Exception{
    public CarIsNotReadyToStart(String message) {
        super(message);
    }
}
