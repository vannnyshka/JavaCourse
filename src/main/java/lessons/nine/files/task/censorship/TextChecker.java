package lessons.nine.files.task.censorship;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

public class TextChecker {

    private static final String pathToBlackList = "src/main/resources/nine/files/censorship/blackList.txt";

    public static void checkText(String path) {


        try {
            String text = new String(Files.readAllBytes(Paths.get(path)));
            List<String> sentences = List.of(text.split("[.!?]\\s+"));


            List<String> blackListSentences = sentences.stream().filter(TextChecker::isBlackListSentence).toList();

            if (!blackListSentences.isEmpty()) {
                System.out.println("Текст не прошел проверку. Количество предложений, которые не прошли цензуру: " + blackListSentences.size() + "\nПредложения, не прошедшие цензуру:");
                blackListSentences.forEach(System.out::println);
            } else {
                System.out.println("Урааа!!! Текст прошел цензуру!!!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    private static boolean isBlackListSentence(String sentence) {
        //Убираем все ненужные символы
        sentence = Pattern.compile("[^a-zа-яА-ЯA-Z0-9\\s\n]").matcher(sentence).replaceAll("");
        //Разделяем на слова
        List<String> words = List.of(sentence.split("\\s+|\n"));
        for (String word : words) {
            if (isBlackListWord(word)) {
                return true;
            }
        }
        return false;
    }


    private static boolean isBlackListWord(String word) {
        try {
            List<String> blackListWords = Files.readAllLines(Paths.get(pathToBlackList));
            for (String blackListWord : blackListWords) {
                if (blackListWord.equalsIgnoreCase(word)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
