package a_polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Load animals
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Pluto"));
        animals.add(new Cat("Sylvester"));
        animals.add(new Dog("Jack"));
        animals.add(new Duck("Donald"));

        // Make animals sound - wrong version
//        for(Animal animal : animals) {
//            if(animal instanceof Dog) {
//                Dog dog = (Dog)animal;
//                dog.sound();
//            }
//            else if(animal instanceof Cat) {
//                Cat cat = (Cat)animal;
//                cat.speak();
//            }
//        }

        for(Animal animal : animals) {
            animal.sound();
        }
    }
}
