package b_strategy_factory_pattern;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        List<Employee> employees = db.getEmployees();

        // print payroll
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
