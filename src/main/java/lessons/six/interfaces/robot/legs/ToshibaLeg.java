package lessons.six.interfaces.robot.legs;

public class ToshibaLeg implements ILeg{

    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Сделала шаг ToshibaLeg");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "ToshibaLeg price=" + price;
    }
}
