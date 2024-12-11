package lessons.nine.files.theory.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestFiles {

    public static void main(String[] args) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/text.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
