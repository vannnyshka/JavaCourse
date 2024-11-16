package lesson6.linkTasks.t6_students;

import java.util.Objects;

public class Aspirant extends Student {

    private int degree;

    public Aspirant(String firstName, String lastName, int group, double averageMark, int degree) {
        super(firstName, lastName, group, averageMark);
        this.degree = degree;
    }

    public int getDegree() {
        return degree;
    }

    public void getScholarship() {

        if (super.getAverageMark() == 5) {
            System.out.println("Стипендия равна 2500 грн");
        } else {
            System.out.println("Стипендия равна 2200 грн");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aspirant aspirant = (Aspirant) o;
        return degree == aspirant.degree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), degree);
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "degree=" + degree +
                '}';
    }
}
