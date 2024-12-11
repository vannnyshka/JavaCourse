package lessons.nine.files.theory.writing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream os = new FileOutputStream("src/main/resources/files/text/write.txt");
        try {
            os.write(232);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
