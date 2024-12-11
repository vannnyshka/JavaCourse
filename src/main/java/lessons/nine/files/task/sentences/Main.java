package lessons.nine.files.task.sentences;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /*Текстовый файл содержит текст. После запуска программы в другой файл
    должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
    предложении присутствует слово-палиндром, то не имеет значения какое кол-во
    слов в предложении, оно попадает в новый файл.
    Пишем все в ООП стиле. Создаём класс TextFormater
    в котором два статических метода:
            1. Метод принимает строку и возвращает кол-во слов в строке.
            2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
    есть возвращает true, если нет false
    В main считываем файл.
    Разбиваем текст на предложения. Используя методы класса TextFormater
    определяем подходит ли нам предложение. Если подходит добавляем его в
    новый файл*/

    public static void main(String[] args) {

        String pathFrom = "src/main/resources/nine/files/sentences/sentences.txt";
        String pathTo = "src/main/resources/nine/files/sentences/formatedSentences.txt";

        try {
            String text = new String(Files.readAllBytes(Paths.get(pathFrom)));
            List<String> sentences = List.of(text.split("[.!?]\\s+"));

            Files.write(Paths.get(pathTo), sentences.stream().filter(sentence -> TextFormater.isHavePalindrome(sentence.trim()) || TextFormater.isNeedLength(sentence.trim())).collect(Collectors.toList()));

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }
}
