package lessons.eight.exceptions.test;

public class Main {
    public static void main(String[] args) {
        System.out.println(getNumb());
    }

    public static int getNumb() {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally {
            return 5;
        }
    }
}
