package b_strategy_factory_pattern;

public class Employee {

    private String name;
    private PaymentStrategy payment;

    public Employee(String name, PaymentStrategy payment) {
        this.name = name;
        this.payment = payment;
    }

    public void setPayment(PaymentStrategy payment) {
        this.payment = payment;
    }

    public String toString() {
        return name + ", payment: " + payment.getPayment();
    }
}
