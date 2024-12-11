package lessons.nine.files.theory.reading;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        try {
            BufferedReader file = new BufferedReader(new FileReader("src/main/resources/text.txt"));

            for(;;){
                String line = file.readLine();
                if(line == null){
                    break;
                }
                builder.append(line + "\n");
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(builder);
    }
}
