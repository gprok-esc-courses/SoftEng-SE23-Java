package c_observer_pattern;

public class LogAction implements ClickButtonObserver {
    @Override
    public void act(String str) {
        System.out.println("Logging " + str);
    }
}
