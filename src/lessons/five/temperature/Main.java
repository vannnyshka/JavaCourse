package lessons.five.temperature;

import java.util.Scanner;

public class Main {

    public static final float MIN_HEALTH = 36.2F;
    public static final float MAX_HEALTH = 36.9F;
    public static final float MIN_TEMP = 32.0F;
    public static final float MAX_TEMP = 40.0F;

    public static void main(String[] args) {

        int countHealth = 0;

        float[] temperature = new float[5];
        float temp;


        Scanner input = new Scanner(System.in);

        int i = 0;

        while (i < temperature.length) {

            System.out.println("Ведите температуру: ");

            temp = input.nextFloat();

            if (temp > MAX_TEMP || temp < MIN_TEMP) {
                System.out.println("ВВЕДИТЕ норм число");
            } else {
                temperature[i++] = temp;
            }

        }


        float avgTemperature = 0.0F;
        //BigDecimal avgTemperature = new BigDecimal("0.0");

        System.out.print("Температуры пациентов: ");
        for (float valueTemperature : temperature) {
            //avgTemperature = avgTemperature.add(BigDecimal.valueOf(valueTemperature)).setScale(2, RoundingMode.HALF_UP);
            //System.out.println(valueTemperature);
            if (valueTemperature > MIN_HEALTH && valueTemperature < MAX_HEALTH) {
                countHealth++;
            }
            avgTemperature += valueTemperature;
            System.out.print(valueTemperature + ", ");

        }
        //System.out.println(avgTemperature);
        //BigDecimal temp = new BigDecimal(temperature.length);
        //avgTemperature = avgTemperature.divide(new BigDecimal(temperature.length));
        //System.out.println(avgTemperature);

        avgTemperature /= temperature.length;
        System.out.println("\nСредняя температура: " + avgTemperature);
        System.out.println("Количество здоровый пациентов: " + countHealth);


    }
}
