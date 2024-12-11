package lessons.nine.files.task.sentences;

import java.util.List;
import java.util.regex.Pattern;

public class TextFormater {


    public static boolean isNeedLength(String sentence) {
        //Убираем тире в словах
        List<String> words = cleanAndSplitSentence(sentence);
        return words.size() >= 3 && words.size() <= 5;
    }



    public static boolean isHavePalindrome(String sentence) {

        List<String> words = cleanAndSplitSentence(sentence);

        for (String word : words) {
            if(isPalindrome(word)){
                return true;
            }
        }
        return false;
    }

    private static List<String> cleanAndSplitSentence(String sentence){

        sentence = Pattern.compile("[^a-zа-яА-ЯA-Z0-9\\s\n]").matcher(sentence).replaceAll("");
        return List.of(sentence.split("\\s+|\n"));

    }


    private static boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        if(chars.length > 1) {
            for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
                if (chars[i] != chars[j]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
