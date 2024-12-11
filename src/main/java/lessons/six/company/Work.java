package lessons.six.company;

import lessons.six.company.employee.Employee;
import lessons.six.company.employee.Manager;
import lessons.six.company.employee.Operator;
import lessons.six.company.employee.TopManager;

import java.util.LinkedList;
import java.util.List;


public class Work {

    public static void main(String[] args) {

        for (int i = 0; i < 180; i++) {
            Operator operator = new Operator();
            Company.hire(operator);
        }

        for (int i = 0; i < 80; i++) {
            Manager manager = new Manager();
            Company.hire(manager);
        }

        List<Employee> topManagers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            TopManager topManager = new TopManager();
            topManagers.add(topManager);
        }

        Company.hireAll(topManagers);
        System.out.println("Общий доход компании: " + Company.getIncome());
        System.out.println(Company.getEmployees());
        Company.getTopSalaryStaff(10);

        Company.getTopSalaryStaff(15);
        Company.getLowestSalaryStaff(30);

        System.out.println("Удаляем 50% сотрудников: ");
        fireFiftyPercentOfEmployees();

        System.out.println("Общий доход компании: " + Company.getIncome());
        System.out.println(Company.getEmployees());
        Company.getTopSalaryStaff(10);

        Company.getTopSalaryStaff(15);
        Company.getLowestSalaryStaff(30);



    }

    public static void fireFiftyPercentOfEmployees() {
        int countLayoffs = (int) (Company.getEmployees().size() * 0.5);
        for (int i = 0; i < countLayoffs; i++) {
            int winner = (int) (Math.random() * Company.getEmployees().size());
            Company.fire(Company.getEmployees().get(winner));
        }
    }

}
