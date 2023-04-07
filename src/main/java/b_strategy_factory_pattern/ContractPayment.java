package b_strategy_factory_pattern;

public class ContractPayment implements PaymentStrategy {

    private int hours;
    private double hourlyWage;

    public ContractPayment(int hours, double hourlyWage) {
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double getPayment() {
        return hours * hourlyWage;
    }
}
