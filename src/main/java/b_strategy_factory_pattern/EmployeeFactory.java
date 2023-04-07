package b_strategy_factory_pattern;

public class EmployeeFactory {
    public static Employee getEmployee(String str) {
        Employee e = null;

        String [] values = str.split(",");
        if(values[1].equals("1")) {     // Fixed payment
            e = new Employee(values[0], new FixedPayment(Integer.parseInt(values[2])));
        }
        else if(values[1].equals("2")) {     // Bonus payment
            e = new Employee(values[0], new BonusPayment(Integer.parseInt(values[2]), Integer.parseInt(values[3])));
        }
        else if(values[1].equals("3")) {     // Contract payment
            e = new Employee(values[0], new ContractPayment(Integer.parseInt(values[2]), Integer.parseInt(values[3])));
        }
        else if(values[1].equals("4")) {     // Contract payment
            e = new Employee(values[0], new OvertimePayment(Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4])));
        }
        return e;
    }
}
