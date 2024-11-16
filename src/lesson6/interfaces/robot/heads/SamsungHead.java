package lesson6.interfaces.robot.heads;

public class SamsungHead implements IHead{

    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "SamsungHead price=" + price;
    }
}
