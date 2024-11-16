package lesson6.linkTasks.t4_library;

import java.time.LocalDate;
import java.util.Objects;

public class Reader {

    private String fullName;
    private int numb;
    private String faculty;
    private LocalDate dateBirth;
    private String phone;

    public Reader(String fullName, int numb, String faculty, String phone, LocalDate dateBirth) {
        this.fullName = fullName;
        this.numb = numb;
        this.faculty = faculty;
        this.phone = phone;
        this.dateBirth = dateBirth;
    }

    public void takeBook(int amountBook) {
        System.out.print("Читатель " + this.fullName + " взял " + amountBook + " книги.\n");
    }

    public void takeBook(String... books) {

        System.out.print("Читатель " + this.fullName + " взял книги: ");

        for (String book : books) {
            System.out.print(book + ", ");
        }

        System.out.println();
    }

    public void takeBook(Book... books) {

        System.out.print("Читатель " + this.fullName + " взял книги: ");

        for (Book book : books) {
            System.out.print(book.getAuthor() + " \"" + book.getBookName() + "\", ");
        }

        System.out.println();
    }


    public void returnBook(int amountBook) {
        System.out.println("Читатель " + this.fullName + " вернул " + amountBook + " книги.");
    }

    public void returnBook(String... books) {

        System.out.print("Читатель " + this.fullName + " вернул книги: ");

        for (String book : books) {
            System.out.println(book + ", ");
        }
    }


    public void returnBook(Book... books) {

        System.out.print("Читатель " + this.fullName + " ипугался и вернул книги: ");

        for (Book book : books) {
            System.out.println(book.getAuthor() + " " + book.getBookName() + ", ");
        }
    }


    public String getFullName() {
        return fullName;
    }


    public int getNumb() {
        return numb;
    }


    public LocalDate getDateBirth() {
        return dateBirth;
    }


    public String getFaculty() {
        return faculty;
    }


    public String getPhone() {
        return phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return numb == reader.numb && Objects.equals(fullName, reader.fullName) && Objects.equals(faculty, reader.faculty) && Objects.equals(dateBirth, reader.dateBirth) && Objects.equals(phone, reader.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, numb, faculty, dateBirth, phone);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", numb=" + numb +
                ", faculty='" + faculty + '\'' +
                ", dateBirth=" + dateBirth +
                ", phone='" + phone + '\'' +
                '}';
    }
}
