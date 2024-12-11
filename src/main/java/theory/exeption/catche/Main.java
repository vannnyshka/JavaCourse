package theory.exeption.catche;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args)  {

        //1-ый способ предотвращения exception - их отлов:
        String[] names = {"Dima","Sergei","Anna"};

        try {
            test(names);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finish");
        }

        try {
            System.out.println(names[10]);
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }

        System.out.println("Hi");

    }

    public static void  test(String[] names) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.parse("kdnf");

        System.out.println("pisa");
    }
}
