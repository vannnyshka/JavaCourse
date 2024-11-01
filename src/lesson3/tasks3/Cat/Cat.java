package lesson3.tasks3.Cat;

public class Cat {

    private String name;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double amountFood;

    public static int totalCat = 0;

    public static int getTotalCat() {
        return totalCat;
    }

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        amountFood = 0;
        totalCat += 1;
    }

    public Cat(String name) {
        this.name = name;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        amountFood = 0;
        totalCat += 1;
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
        }
        else {
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
        }
        else {
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
        return "Cat{"
                + "Name='" + name + '\''
                + ", weight=" + weight
                + ", amountFood=" + amountFood
                + ", Status=" + getStatus()
                + '}';
    }

}
