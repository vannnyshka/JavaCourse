package lessons.six.interfaces.robot.hands;

public class SamsungHand implements IHand{

    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Samsung рука еле поднялась");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "SamsungHand price=" + price;
    }
}
