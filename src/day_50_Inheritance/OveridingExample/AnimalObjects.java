package day_50_Inheritance.OveridingExample;

import java.util.concurrent.Callable;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Traitor";
        animal.type = "Lazy";
        animal.speak();

        Cat cat =  new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
