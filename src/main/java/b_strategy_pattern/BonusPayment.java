package b_strategy_pattern;

public class BonusPayment implements PaymentStrategy {

    private double salary;
    private double bonus;

    public BonusPayment(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double getPayment() {
        return salary + bonus;
    }
}
