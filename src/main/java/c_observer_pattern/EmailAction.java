package c_observer_pattern;

public class EmailAction implements ClickButtonObserver {
    @Override
    public void act(String str) {
        System.out.println("Sending " + str + " to email");
    }
}
