package a_polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Dog " + name + " says Wooof");
    }
}
