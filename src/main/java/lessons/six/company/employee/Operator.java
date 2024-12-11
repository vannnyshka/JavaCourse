package lessons.six.company.employee;

import java.math.BigDecimal;
import java.util.Objects;

public class Operator implements Employee {

    private BigDecimal companyIncome;
    private BigDecimal salary = new BigDecimal("50000");
    private String position = "Operator";

    public Operator() {
        this.companyIncome = BigDecimal.valueOf((int) (Math.random() * 25001 + 115000));
    }

    @Override
    public BigDecimal getMonthSalary() {
        return salary;
    }

    public BigDecimal getCompanyIncome() {
        return companyIncome;
    }

    public String getPosition() {
        return position;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return Objects.equals(companyIncome, operator.companyIncome) && Objects.equals(salary, operator.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyIncome, salary);
    }

    @Override
    public String toString() {
        return "Operator{" +
                "companyIncome=" + companyIncome +
                ", salary=" + salary +
                '}';
    }
}
