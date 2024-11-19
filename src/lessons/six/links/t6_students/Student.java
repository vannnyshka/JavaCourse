package lessons.six.links.t6_students;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void getScholarship() {

        if (this.averageMark == 5) {
            System.out.println("Стипендия равна 2000 грн");
        } else {
            System.out.println("Стипендия равна 1900 грн");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group && Double.compare(averageMark, student.averageMark) == 0 && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, group, averageMark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}';
    }


}
