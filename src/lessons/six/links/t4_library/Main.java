package lessons.six.links.t4_library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Reader> readerList = new ArrayList<>();

        Reader anna = new Reader("Анна Антоновна", 324, "ФИТУ", "375334352365", LocalDate.of(2001, 10, 11));
        readerList.add(anna);
        anna.takeBook(3);

        Reader boris = new Reader("Борис Моисеевич", 325, "КСИС", "375334352366", LocalDate.of(1995, 10, 11));
        readerList.add(boris);
        boris.takeBook("Муму", "Капитанская дочка", "Старик и Море");

        Book bookOne = new Book("Джоан Роулинг", "Гарри Поттер");
        Book bookTwo = new Book("Ольга Бузова", "Пока ты без дел");
        Book bookTree = new Book("Ольга Бузова", "Твоя роковая ошибка");

        Reader stasik = new Reader("Стас Михаяйлов", 326, "ФИТУ", "375334352367", LocalDate.of(1990, 10, 11));
        readerList.add(stasik);
        stasik.takeBook(bookOne, bookTwo);

        Reader lera = new Reader("Валерия Вашкевич", 327, "Юридический", "375324324385", LocalDate.of(2001,12,12));
        lera.takeBook(bookTree);
        lera.returnBook(bookTree);

    }

}
