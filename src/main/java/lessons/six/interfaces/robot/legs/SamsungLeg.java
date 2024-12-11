package lessons.six.interfaces.robot.legs;

public class SamsungLeg implements ILeg{

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }


    @Override
    public void step() {
        System.out.println("Сделала шаг SamsungLeg");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "SamsungLeg price=" + price;
    }
}
