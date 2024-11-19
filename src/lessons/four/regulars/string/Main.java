package lessons.four.regulars.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        String input = "My family is very important to me. We do lots of things together. My brothers and I like to go on long walks in the mountains, my sister likes to cook with my grandmother. On the weekends we all play board games together. We laugh and always have a good time.";
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
