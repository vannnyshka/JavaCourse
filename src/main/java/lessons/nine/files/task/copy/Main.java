package lessons.nine.files.task.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

    /*Написать программу, который будет копировать папку с файлами с сохранением структуры.
      На вход: путь папки, которую копирую и путь к папке, В которую копирую.*/

    public static void main(String[] args) {
        String pathFrom = "src/main/resources/files/";
        String pathTo = "src/main/resources/copy/";

        copyDirectory(pathFrom, pathTo);
    }

    public static void copyDirectory(String pathFrom, String pathTo) {
        try {
            File folderFrom = new File(pathFrom);
            File folderTo = new File(pathTo + folderFrom.getName() + "/");

            if (folderTo.exists()) {
                System.out.println("Такая папка уже существует.\n Попробуйте скопировать в другой место или поменять название папки которую копируете.");
            } else {
                folderTo.mkdir();
                File[] files = folderFrom.listFiles();

                for (File file : files) {
                    if (file.isDirectory()) {
                        copyDirectory(file.getPath() + "/", folderTo.getPath() + "/");
                    } else {
                        String fileName = file.getName();
                        FileInputStream inputStream = new FileInputStream(file);
                        FileOutputStream outputStream = new FileOutputStream(new File(folderTo.getPath() + "/" + fileName));

                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = inputStream.read(buffer)) > 0) {
                            outputStream.write(buffer, 0, length);
                        }
                        inputStream.close();
                        outputStream.close();
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
