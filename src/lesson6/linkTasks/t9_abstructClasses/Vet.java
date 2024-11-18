package lesson6.linkTasks.t9_abstructClasses;

import lesson6.linkTasks.t9_abstructClasses.animals.Animal;

import java.util.Objects;

public class Vet {

    private String fullName;

    public Vet(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void treatAnimal(Animal animal) {

        System.out.println("I'm a Doctor " + this.fullName + " and u?");
        animal.getDescription();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vet vet = (Vet) o;
        return Objects.equals(fullName, vet.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fullName);
    }

    @Override
    public String toString() {
        return "Vet{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
