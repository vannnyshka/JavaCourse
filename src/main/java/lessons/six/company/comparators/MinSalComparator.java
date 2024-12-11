package lessons.six.company.comparators;

import lessons.six.company.employee.Employee;

import java.util.Comparator;

public class MinSalComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getMonthSalary().compareTo(o2.getMonthSalary());
    }
}
