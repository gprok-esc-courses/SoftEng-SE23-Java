package c_observer_pattern;

public class DBAction implements ClickButtonObserver {
    @Override
    public void act(String str) {
        System.out.println("Saving " + str + " to databse");
    }
}
