package a_polymorphism;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(name + " the Cat says Mieow");
    }

    public void sound() {
        speak();
    }
}
