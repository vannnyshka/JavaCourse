package lesson3.tasks3.Cat;

public class Cat {

    private String name;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double amountFood;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        amountFood = 0;

    }

    public Cat(String name){
        this.name = name;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        amountFood = 0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
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
        } else {
            System.out.println("Your cat doesn't say 'MEOW'. Your cat is " + status);
        }
    }

    public void feed(Double amount) {
        weight = weight + amount;
        amountFood += amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
        amountFood += amount;
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
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    @Override
    public String toString() {
        return "Cat{"
                + "Name='" + name + '\''
                + ", weight=" + weight
                + ", amountFood=" + amountFood
                + ", Status=" + getStatus()
                + '}';
    }

}
