package lessons.six.interfaces.robot.hands;

public class SonyHand implements IHand{

    private int price;

    public SonyHand(int price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Sony рука поднялась ровно на задаваемый уровень");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "SonyHand price=" + price;
    }
}
