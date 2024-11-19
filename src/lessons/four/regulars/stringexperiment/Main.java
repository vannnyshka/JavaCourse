package lessons.four.regulars.stringexperiment;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        BigDecimal result = new BigDecimal("0");

        String input = "Вася заработал 5000.65 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        Pattern pattern = Pattern.compile("\\d+((,|.)\\d+)?");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            result = result.add(new BigDecimal(matcher.group()));
        }
        System.out.println(result);
    }
}
