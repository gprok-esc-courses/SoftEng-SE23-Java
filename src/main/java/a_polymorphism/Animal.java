package a_polymorphism;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void sound();
}
