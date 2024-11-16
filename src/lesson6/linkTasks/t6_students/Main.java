package lesson6.linkTasks.t6_students;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student pasha = new Student("Паша", "Иванов", 406, 4.5);
        students.add(pasha);

        Student katya = new Student("Катя", "Петрова", 406, 5);
        students.add(katya);

        Aspirant marina = new Aspirant("Марина", "Петрова", 407, 5, 1);
        students.add(marina);

        Aspirant lida = new Aspirant("Лидия", "Михайлова", 408, 3, 1);
        students.add(marina);

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " из группы " + student.getGroup() + ":");
            student.getScholarship();
            System.out.println();
        }

    }
}
