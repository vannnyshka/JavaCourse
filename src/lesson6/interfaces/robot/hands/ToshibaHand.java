package lesson6.interfaces.robot.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Toshiba рука взлетела ввысь");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "ToshibaHand price=" + price;
    }
}
