package lessons.six.company.employee;

import java.math.BigDecimal;

public interface Employee extends Comparable<Employee> {

    BigDecimal getMonthSalary();

    BigDecimal getCompanyIncome();

    @Override
    default int compareTo(Employee o) {
        if (o.getMonthSalary().compareTo(getMonthSalary()) > 0) {
            return 1;
        }
        if (o.getMonthSalary().compareTo(getMonthSalary()) < 0) {
            return -1;
        }
        return 0;
    }
}
