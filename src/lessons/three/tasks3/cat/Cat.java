package lessons.three.tasks3.cat;

public class Cat {

    private String name;
    //private double originWeight;
    private double weight;
    private CatColor color;

    public static final double minWeight = 1000;
    public static final double maxWeight = 9000;
    public static final int countEye = 2;

    private double amountFood;

    public static int totalCat = 0;

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setColor(CatColor color) {
        this.color = color;
    }

    public CatColor getColor() {
        return this.color;
    }

    public static int getTotalCat() {
        return totalCat;

    }

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        //originWeight = this.weight;
        amountFood = 0;
        totalCat += 1;
        this.name = "Noname";
        this.color = CatColor.BLACK;
    }

    public Cat(String name, CatColor color) {

        this();
        this.color = color;
        this.name = name;

    }

    public Cat(String name, CatColor color, double weight) {

        this();
        this.weight = weight;
        this.color = color;
        this.name = name;

    }

    public Cat(Cat copy) {
        name = copy.getName();
        color = copy.getColor();
        weight = copy.getWeight();
    }

    public Cat(double weight) {

        this();
        this.weight = weight;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goToilet() {
        String status = getStatus();

        if (status.equals("Playing")) {

            double waste = Math.random();

            weight = weight - waste;

            if (waste <= 0.3) {
                System.out.println("I'm peeing");
            } else {
                System.out.println("I'm pooping");
            }
        } else {
            System.out.println("Your cat is " + status);
        }
    }

    public void meow() {

        String status = getStatus();

        if (status.equals("Playing") || status.equals("Sleeping")) {
            weight = weight - 1;
            System.out.println("Meow");

            status = getStatus();

            if (status.equals("Dead")) {
                totalCat -= 1;
            }

        } else {
            System.out.println("Your cat doesn't say 'MEOW'. Your cat is " + status);
        }
    }

    public void feed(Double amount) {
        String status = getStatus();
        if (status.equals("Playing")) {
            weight = weight + amount;
            amountFood += amount;
            status = getStatus();
            if (status.equals("Exploded")) {
                totalCat -= 1;
            }
        } else {
            System.out.println("Your cat doesn't feed. Your cat is " + status);
        }
    }

    public void drink(Double amount) {
        String status = getStatus();
        if (status.equals("Playing")) {
            weight = weight + amount;
            amountFood += amount;
            status = getStatus();
            if (status.equals("Exploded")) {
                totalCat -= 1;
            }
        } else {
            System.out.println("Your cat doesn't drink. Your cat is " + status);
        }
    }

    public Double getWeight() {
        return weight;
    }

    public Double getAmountFood() {
        return amountFood;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        }
        //else if (weight > originWeight) {
        // return "Sleeping";
        //}
        else {
            return "Playing";
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                //", originWeight=" + originWeight +
                ", weight=" + weight +
                ", color=" + color +
                ", amountFood=" + amountFood +
                '}';
    }
}
