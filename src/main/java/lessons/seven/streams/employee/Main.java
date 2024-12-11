package lessons.seven.streams.employee;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.*;

public class Main {
    private static String staffFile = "src/lessons/seven/streams/data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();

        //Выведите в консоль с помощью Stream API сотрудника с максимальной зарплатой среди тех, кто пришёл в 2017 году
        staff.stream()
                .filter(e -> e.getWorkStart().toInstant().atZone(ZoneId.systemDefault()).getYear() == 2017)
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

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