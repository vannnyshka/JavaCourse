package lesson3.tasks2;

public class Task1 {
    public static void main(String[] args) {

        double distance = 10;

        for (int i = 1; i < 7; i++) {

            distance += distance * 0.1;

        }

        System.out.println(distance);

    }
}
