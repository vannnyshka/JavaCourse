package lessons.six.interfaces.robot.legs;

public class SonyLeg implements ILeg{

    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }


    @Override
    public void step() {
        System.out.println("Сделала шаг SonyLeg");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "SonyLeg price=" + price;
    }
}
