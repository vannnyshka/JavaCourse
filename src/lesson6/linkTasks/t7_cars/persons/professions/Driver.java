package lesson6.linkTasks.t7_cars.persons.professions;

import lesson6.linkTasks.t7_cars.persons.Person;

import java.util.Objects;


public class Driver extends Person {


    private int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience);
    }

    @Override
    public String toString() {
        return "\n\tВодитель:" +
                "\n\t\tФИО: " + super.getFullName() +
                ",\n\t\tСтаж: " + experience;
    }
}
