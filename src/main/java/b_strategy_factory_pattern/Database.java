package b_strategy_factory_pattern;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private String [] employees = {
        "John,1,1200",
        "Mary,2,1300,200",
        "Peter,3,30,12",
        "Mike,4,1000,12,10"
    };

    public List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        for(String str : employees) {
            Employee e = EmployeeFactory.getEmployee(str);
            if(e != null) {
                employeeList.add(e);
            }
        }

        return employeeList;
    }
}
