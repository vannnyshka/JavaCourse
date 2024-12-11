package lessons.seven.streams.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Оруэлл", "Скотный двор", 2010));
        books.add(new Book("Кинг", "ОНО", 2015));
        books.add(new Book("Кинг", "Институт", 2020));
        books.add(new Book("Кинг", "Зеленая миля", 2022));
        books.add(new Book("Крамер", "50ДДМС", 2015));
        //и так далее для других книг

        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Зданевич Анна Валерьевна", "zdab@test.ru", true));
        readers.add(new Reader("Петров Петр Петрович", "tttt@test.ru", false));
        //и так далее для других читателей

        readers.get(0).getBooks().add(books.get(1));
        readers.get(0).getBooks().add(books.get(2));

        readers.get(1).getBooks().add(books.get(3));

        readers.get(2).getBooks().add(books.get(0));
        readers.get(2).getBooks().add(books.get(4));
        readers.get(2).getBooks().add(books.get(5));
        //и так далее для других читателей и взятых книг
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}