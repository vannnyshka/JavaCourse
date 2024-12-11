package lessons.nine.files.task.palindrome;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String path = "src/main/resources/nine/files/palindrome/palindrome.txt";

        try {
            List<String> palindromes = Files.readAllLines(Paths.get(path)).stream().filter(word -> isPalindrome(word.trim())).collect(Collectors.toList());
            Files.write(Paths.get(path), palindromes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
