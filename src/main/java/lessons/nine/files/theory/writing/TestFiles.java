package lessons.nine.files.theory.writing;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TestFiles {
    public static void main(String[] args) {

        try {
            ArrayList<String> strings = new ArrayList<>();
            for(int i = 0; i < 100; i++){
                strings.add(Integer.toString(i));
            }
            Files.write(Paths.get("src/main/resources/files/text/files.txt"), strings);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
