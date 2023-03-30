package a_polymorphism;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        quack();
    }

    public void quack() {
        System.out.println("The Duck called " + name + " says Quack");
    }
}
