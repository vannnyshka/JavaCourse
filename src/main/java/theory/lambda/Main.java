package theory.lambda;

import lessons.seven.streams.employee.Employee;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    private static String staffFile = "src/theory/lambda/data/staff.txt";
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

        System.out.println("\nСтарый список сотрудников до увеличения ЗП:\n");

        staffTwo.forEach(System.out::println);

        int salaryIncrease = 10000;
        staffTwo.forEach(e -> e.setSalary(e.getSalary() + salaryIncrease));

        //Напечатать сотрудников, у кого зп больше, чем 100к рублей.
        staff.stream().filter(e -> e.getSalary() >= 100000).forEach(System.out::println);

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 64, 32, 43);
        numbers.filter(n -> n % 2 == 0).forEach(System.out::println);

        Integer[] numbersTwo = {1, 2, 3, 54, 34, 32};
        Arrays.stream(numbersTwo).sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        Stream.iterate(1, n -> n + 1).forEach(System.out::println);
//        Stream.generate(() -> "noob2000").forEach(System.out::println);

        "Биба бобу била много".chars().forEach(System.out::println);

        staff.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        staff.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        staff.stream()
                .map(Employee::getSalary)
                .filter(s -> s >= 10000)
                .reduce(Integer::sum)
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