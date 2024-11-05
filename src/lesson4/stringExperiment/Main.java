package lesson4.stringExperiment;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        /*Напишите код в проекте StringExperiments, который считает сумму заработка всех друзей (Васи, Пети и Маши).
         Используйте методы indexOf(), lastIndexOf(), substring() и trim().*/

        String text = "Вася заработал 5000.0045 рублей, Петя - 7563.2267 рубля, а Маша - 30000.2254 рублей";

        int spaceOneIndex = text.indexOf(' ');

        int spaceTwoIndex = text.indexOf(' ', spaceOneIndex + 1);

        BigDecimal vasyaSal = new BigDecimal(text.substring(spaceTwoIndex, text.indexOf(' ', spaceTwoIndex + 1)).trim());
        System.out.println("Зарплата Васи: " + vasyaSal);

        int dashIndex = text.indexOf('-') + 1;

        BigDecimal petyaSal = new BigDecimal(text.substring(dashIndex, text.indexOf(' ', dashIndex + 1)).trim());
        System.out.println("Зарплата Пети: " + petyaSal);

        dashIndex = text.lastIndexOf('-') + 1;
        BigDecimal mashaSal = new BigDecimal(text.substring(dashIndex, text.indexOf(' ', dashIndex + 1)).trim());
        System.out.println("Зарплата Маши: " + mashaSal);

        BigDecimal sumSal = vasyaSal.add(petyaSal).add(mashaSal);
        System.out.println(sumSal.setScale(2, RoundingMode.HALF_UP));


    }
}
