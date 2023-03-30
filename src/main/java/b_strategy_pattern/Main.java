package b_strategy_pattern;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee john = new Employee("John", new FixedPayment(1200));
        employees.add(john);
        employees.add(new Employee("Mary", new BonusPayment(1200, 300)));
        employees.add(new Employee("Peter", new ContractPayment(30, 12)));
        john.setPayment(new BonusPayment(1200, 100));

        // print payroll
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
