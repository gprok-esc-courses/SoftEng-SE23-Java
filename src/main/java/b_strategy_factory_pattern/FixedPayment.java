package b_strategy_factory_pattern;

public class FixedPayment implements PaymentStrategy {

    private double salary;

    public FixedPayment(double salary) {
        this.salary = salary;
    }
    @Override
    public double getPayment() {
        return salary;
    }
}
