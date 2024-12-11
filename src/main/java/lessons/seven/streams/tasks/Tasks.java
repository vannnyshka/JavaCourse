package lessons.seven.streams.tasks;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
        /*### Задание 1: Фильтрация и преобразование
        1. Создайте список строк List<String> names = Arrays.asList("Anna", "Mark", "Paul", "Peter", "Maria", "John", "Anastasia");
        2. Используйте Stream API, чтобы:
            - Оставить только те имена, которые начинаются с буквы "A".
            - Преобразовать их в верхний регистр.
            - Собрать результат в новый список.*/

        List<String> names = Arrays.asList("Anna", "Mark", "Paul", "Peter", "Maria", "John", "Anastasia");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList()).forEach(System.out::println);


        /*### Задание 2: Преобразование и подсчёт
        1. Создайте список чисел List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        2. Используйте Stream API, чтобы:
            - Преобразовать каждый элемент списка в его квадрат.
            - Подсчитать количество чисел, которые больше 20.*/


        int countNumbs = (int) Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(numb -> Math.pow(numb, 2))
                .filter(numb -> numb > 20)
                .count();

        System.out.println(countNumbs);


        /*### Задание 3: Группировка по критерию
            1. Создайте список объектов Person, каждый из которых имеет поля name и age.
            2. Заполните список несколькими людьми разных возрастов.
            3. Используйте Stream API, чтобы сгруппировать людей по возрасту (например, до 18 лет и 18+), и соберите результат в Map<String, List<Person>>.*/

        List<Person> people = Arrays.asList(
                new Person("Katya", 23),
                new Person("Lia", 30),
                new Person("Boris", 47),
                new Person("Kolya", 18),
                new Person("Vanya", 18)
        );
        Map<String, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(p -> p.getAge() > 18 ? "Adults" : "Minors"));
        System.out.println(groupedByAge);


        /*### Задание 4: Поиск и отображение данных
            1. Создайте список чисел от -10 до 10. IntStream
            2. Используйте Stream API, чтобы найти:
                - Наименьшее положительное число.
                - Наибольшее отрицательное число.
                - Преобразуйте их в строку и выведите в формате: "Min Positive: X, Max Negative: Y".*/
        List<Integer> intStream = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        Optional<Integer> minPositive = intStream.stream().filter(numb -> numb > 0).min(Integer::compareTo);
        Optional<Integer> maxNegative = intStream.stream().filter(numb -> numb < 0).max(Integer::compareTo);
        System.out.println("Min Positive: " + minPositive.orElse(null) + ". Max Negative: " + maxNegative.orElse(null));

        /*### Задание 5: Подсчёт уникальных значений и сортировка
        1. Создайте список строк, в котором некоторые слова повторяются.
        2. Используйте Stream API, чтобы:
            - Найти уникальные слова и отсортировать их в алфавитном порядке.
            - Подсчитать частоту каждого уникального слова и вывести в формате Map<String, Long>.*/

        List<String> words = Arrays.asList("go", "apple", "pineapple", "apple", "banana", "banana");
        List<String> uniqueWords = words.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));


        uniqueWords.forEach(System.out::println);
        System.out.println();

        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println();


        /*### Задание 6: Использование Optional для обработки пустых значений
        1. Создайте список строк, например, List<String> words = Arrays.asList("apple", "banana", "cherry", "", null, "date");.
        2. Используйте Stream API и Optional, чтобы:
           - Отфильтровать пустые строки и null.
           - Найти строку с максимальной длиной (при помощи max()), завернув её в Optional.
           - Если максимальная строка найдена, выведите её, иначе выведите сообщение "No valid strings found.
           - Сгруппировать строки по их длине в Map<Integer, List<String>>.
           - Вывести результат в виде Map с ключами-длинами строк и значениями-списками слов, соответствующей длины."*/

        // List<String> words;

        words = Arrays.asList("apple", "banana", "cherry", "", null, "date");

        System.out.println(words
                .stream()
                .filter(w -> w != null && !w.isEmpty())
                .max(Comparator.comparingInt(String::length)).orElse("No valid strings found"));

        Map<Integer, List<String>> mapTwo = words.stream()
                .filter(w -> w != null && !w.isEmpty())
                .collect(Collectors.groupingBy(String::length));
        System.out.println(mapTwo);

        /*### Задание 7: Подсчёт с использованием Collectors.counting и Collectors.groupingBy
        1. Создайте список чисел, например, List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);.
        2. Используйте Stream API и Optional, чтобы:
           - Найти первое четное число в списке (используя findFirst()).
           - Если число найдено, увеличьте его на 10 и выведите, иначе выведите "No even number found."
        3. Используйте Stream API и Collectors для группировки:
           - Подсчитайте, сколько раз каждое число встречается в списке, используя Collectors.groupingBy и Collectors.counting.
           - Сохраните результат в Map<Integer, Long> и выведите его.*/

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);

        Optional<Integer> num = numbers.stream()
                .filter(numb -> numb % 2 == 0)
                .findFirst();


        //num.ifPresentOrElse(n -> System.out.println("first +10:" + (n + 10)), () -> System.out.println("No even number found"));
        System.out.println();

        num.map(n -> n + 10).ifPresent(n -> System.out.println("first +10: " + n));

        Map<Integer, Long> mapTree = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(mapTree);

        /*### Задание 8: Соединение строк с использованием Collectors.joining
        1. Создайте список имен List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");.
        2. Используйте Collectors.joining, чтобы:
           - Объединить все имена в одну строку, разделяя их запятыми и добавляя квадратные скобки в начале и конце.
           - Например, результат должен быть "[Alice, Bob, Charlie, Dave]".*/

        List<String> firstNames = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        String listNames = firstNames.stream().collect(Collectors.joining(",","[", "]"));
        System.out.println(listNames);



    }
}
