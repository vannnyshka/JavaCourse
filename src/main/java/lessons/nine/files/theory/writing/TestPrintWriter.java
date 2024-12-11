package lessons.nine.files.theory.writing;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPrintWriter {

    public static void main(String[] args) {

        PrintWriter writer = null;
        try {
            writer = new PrintWriter("src/main/resources/files/text/printWriter.txt");
            for (int i = 0; i < 50; i++){
                writer.write(i+"\n");
            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
