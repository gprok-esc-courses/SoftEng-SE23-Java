package b_strategy_factory_pattern;

public class OvertimePayment implements PaymentStrategy {

    private int salary;
    private int hours;
    private int rate;

    public OvertimePayment(int salary, int hours, int rate) {
        this.salary = salary;
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double getPayment() {
        return salary + (hours * rate);
    }
}
