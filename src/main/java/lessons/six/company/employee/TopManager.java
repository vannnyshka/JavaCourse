package lessons.six.company.employee;

import lessons.six.company.Company;

import java.math.BigDecimal;
import java.util.Objects;

public class TopManager implements Employee {

    private static final BigDecimal percent = new BigDecimal("1.5");
    private BigDecimal companyIncome;
    private BigDecimal salary = new BigDecimal("100000");
    private String position = "TopManager";

    public TopManager() {
        this.companyIncome = BigDecimal.valueOf((int) (Math.random() * 25001 + 115000));
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public BigDecimal getCompanyIncome() {
        return companyIncome;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public BigDecimal getMonthSalary() {

        if (Company.getIncome() != null) {
            int compareResult = Company.getIncome().compareTo(BigDecimal.valueOf(10000000));
            if (compareResult >= 0) {
                return salary.add(salary.multiply(percent));
            }
        }
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopManager that = (TopManager) o;
        return Objects.equals(companyIncome, that.companyIncome) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyIncome, salary);
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "companyIncome=" + companyIncome +
                ", salary=" + salary +
                '}';
    }
}
