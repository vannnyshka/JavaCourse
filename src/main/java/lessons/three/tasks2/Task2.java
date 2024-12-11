package lessons.three.tasks2;

public class Task2 {
    public static void main(String[] args) {
        /*2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/
        int kletka = 1;

        for (int i = 1; i <= 24; i++) {
            if (i % 3 == 0) {
                kletka *= 2;
            }
        }

        System.out.println(kletka);
        System.out.println("Способ 2");
        kletka = 1;
        for (int i = 3; i < 25; i += 3) {
            kletka *= 2;
        }
        System.out.println(kletka);
        int count = 1;
        System.out.println("Способ 3");
        count = 3;
        while (count < 25) {
            System.out.println("Часов " + count + " , амеб " + (int) Math.pow(2, count / 3));
            count = count + 3;
        }
    }
}
