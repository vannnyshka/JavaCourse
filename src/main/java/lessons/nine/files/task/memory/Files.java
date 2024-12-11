package lessons.nine.files.task.memory;

import java.io.File;

public class Files {
    public static void main(String[] args) {
        /*Напишите программу. Она должна:
            •	получать через консоль путь от пользователя до папки;
            •	суммировать размер файлов папки и вложенных папок;
            •	выводить полученную сумму файлов в удобочитаемом виде — в байтах, килобайтах, мегабайтах или гигабайтах;
            •	программа должна перехватывать все исключения, возникающие при ошибках чтения файлов и папок, и выводить
                сообщение об ошибке с трассировкой стека (stack trace).*/

        String path = "src/main/resources/files/";
        System.out.println(calcFiles(path, Mode.KILOBYTE));

    }


    private static double calcFiles(String path, Mode mode){
        double sum = 0;

        try {
            File folder = new File(path);
            File[] files = folder.listFiles();

            for(File file : files){

                if(file.isDirectory()){
                    sum += calcFiles(file.getPath(), mode);
                } else {
                    sum += file.length();
                }

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return Math.round((sum/mode.getSize()) * 100.0) / 100.0;
    }

}

