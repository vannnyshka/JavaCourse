package lessons.six.company;

import lessons.six.company.comparators.MaxSalComparator;
import lessons.six.company.employee.Employee;
import lessons.six.company.comparators.MinSalComparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Company {

    private static List<Employee> employees = new LinkedList<>();

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static List<Employee> getTopSalaryStaff(int count) {
        return getComparingStaffList(new MaxSalComparator(), "высоких зарплат", count);
    }

    public static List<Employee> getLowestSalaryStaff(int count) {
        return getComparingStaffList(new MinSalComparator(), "низких зарплат", count);
    }

    private static List<Employee> getComparingStaffList(Comparator<Employee> comparator, String type, int count) {
        if ((employees.size() >= count) && (count > 0)) {
            System.out.println("Топ-" + count + " " + type + " компании:");
            employees.sort(comparator);

            List<Employee> topSalaryStaff = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                topSalaryStaff.add(employees.get(i));
                System.out.println(employees.get(i).getMonthSalary() + " руб.");
            }
            System.out.println();
            return topSalaryStaff;
        }
        return null;
    }


    public static BigDecimal getIncome() {
        BigDecimal companyIncome = new BigDecimal("0");
        for (Employee employee : employees) {
            companyIncome = companyIncome.add(employee.getCompanyIncome());
        }
        return companyIncome;
    }

    public static void hire(Employee employee) {
        employees.add(employee);
    }

    public static void hireAll(List<Employee> employees) {
        Company.employees.addAll(employees);
        System.out.println("На работу принят список сотрудников в количестве: " + employees.size());
        System.out.println();
    }

    public static void fire(Employee employee) {
        employees.remove(employee);
    }


}
