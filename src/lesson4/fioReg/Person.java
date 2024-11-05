package lesson4.fioReg;

import java.util.Objects;
import java.util.regex.Pattern;

public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String phone;


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

    public Person(String name, String surname, String patronymic, String phone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
    }

    public Person(String string, String phone) {
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

            Pattern pattern = Pattern.compile("\\s");
            String[] strings1 = pattern.split(string);

            this.name = strings1[0];
            this.surname = strings1[1];
            this.patronymic = strings1[2];
        }


        phone = phone.replaceAll("[^\\d]", "");

        if (phone.length() == 10 || phone.length() == 11) {
            if (phone.length() == 10) {
                phone = "7" + phone;
                this.phone = phone;
            } else {
                if (phone.charAt(0) == '7') {
                    this.phone = phone;
                } else {
                    if (phone.charAt(0) == '8') {
                        phone = "7" + phone.substring(1);
                        this.phone = phone;
                    } else {
                        System.out.println("Неверный формат номера");
                    }
                }
            }
        } else {
            System.out.println("Неверный формат номера");
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
                ", phone='" + phone + '\'' +
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
