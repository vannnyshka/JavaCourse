package lessons.seven.streams.library;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        //Получить список всех книг библиотеки, отсортированных по году издания.
        library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .forEach(System.out::println);
        System.out.println();

        //Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
        // При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
        library.getReaders().stream()
                .map(Reader::getEmail)
                .forEach(System.out::println);
        System.out.println();

        //Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
        // Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
        library.getReaders().stream()
                .filter(r -> (r.isSubscriber() && r.getBooks().size() > 1))
                .map(Reader::getEmail)
                .forEach(System.out::println);
        System.out.println();

        //Получить список всех книг, взятых читателями.
        // Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).

        List<Book> bookList = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
        //Метод collect(Collectors.toList()) замыкает стрим в список (List).
        System.out.println();

        //Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Оруэлла.

        //Вначале сделать потоки книг из потока читателей, затем узнать, брал ли он когда-нибудь такую книгу или нет
        boolean isHave = library.getReaders().stream().flatMap(r -> r.getBooks().stream()).anyMatch(b -> b.getAuthor().equals("Оруэлл"));
        System.out.println(isHave);
        System.out.println();

        //Узнать наибольшее число книг, которое сейчас на руках у читателя
        //int countBook


        int countBook = library.getReaders().stream()
                .map(r -> r.getBooks().size())
                .reduce(0, (max, size) -> size > max ? size : max);

        System.out.println(countBook);
        System.out.println();

        Map<String, List<EmailAddress>> map = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        mapping(r -> new EmailAddress(r.getEmail()), Collectors.toList())));


    }
}
