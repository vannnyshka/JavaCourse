package lessons.six.company.employee;

import java.math.BigDecimal;
import java.util.Objects;

public class Manager implements Employee {

    private static final BigDecimal percent = new BigDecimal("0.05");
    private BigDecimal companyIncome;
    private BigDecimal salary = new BigDecimal("70000");
    private String position = "Manager";

    public Manager() {
        this.companyIncome = BigDecimal.valueOf((int) (Math.random() * 25001 + 115000));
    }

    @Override
    public BigDecimal getMonthSalary() {
        return salary.add(companyIncome.multiply(percent));
    }

    public BigDecimal getCompanyIncome() {
        return companyIncome;
    }

    public String getPosition() {
        return position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(companyIncome, manager.companyIncome) && Objects.equals(salary, manager.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyIncome, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "companyIncome=" + companyIncome +
                ", salary=" + salary +
                '}';
    }
}
