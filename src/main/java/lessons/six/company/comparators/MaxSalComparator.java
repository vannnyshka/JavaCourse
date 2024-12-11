package lessons.six.company.comparators;

import lessons.six.company.employee.Employee;

import java.util.Comparator;

public class MaxSalComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getMonthSalary().compareTo(o1.getMonthSalary());
    }
}