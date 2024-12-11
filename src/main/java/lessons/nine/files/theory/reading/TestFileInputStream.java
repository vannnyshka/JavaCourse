package lessons.nine.files.theory.reading;
import java.io.FileInputStream;

public class TestFileInputStream {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        try {
            FileInputStream file = new FileInputStream("src/main/resources/text.txt");

            for(;;){
                int code = file.read();
                //Если код = -1
                if(code < 0) {
                    break;
                }
                builder.append((char) code);
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(builder);


    }
}
