package lessons.seven.lambda;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static String staffFile = "src/lessons/seven/lambda/data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();

        staff.sort((o1, o2) ->
                {
                    int result = o1.getSalary().compareTo(o2.getSalary());
                    if (result == 0) {
                        result = o1.getName().compareTo(o2.getName());
                    }
                    return result;
                }
        );

        System.out.println("Сортировка лямбдой:\n");

        for (Employee employee : staff) {
            System.out.println(employee);
        }

        ArrayList<Employee> staffTwo = loadStaffFromFile();

        staffTwo.sort(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName));

        System.out.println("\nСортировка компаратором другим:\n");

        staffTwo.forEach(System.out::println);

    }

    private static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {

            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}