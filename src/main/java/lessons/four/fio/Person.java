package lessons.four.fio;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Person(String string) {
        string = string.trim();

        int countSpace = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == ' ') {
                countSpace += 1;
            }
        }

        if (countSpace != 2) {
            System.out.println("ФИО должно быть в формате Фамилия Имя Отчество");
        } else {
            int spaceIndexOne = string.indexOf(' ');
            int spaceIndexTwo = string.indexOf(' ', spaceIndexOne + 1);

            String surname = string.substring(0, spaceIndexOne).trim();
            String name = string.substring(spaceIndexOne, spaceIndexTwo).trim();
            String patronymic = string.substring(spaceIndexTwo).trim();
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
        }
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic);
    }


}
