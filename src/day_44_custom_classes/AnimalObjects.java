package day_44_custom_classes;

import test1.Practice2;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal(); // this is an object that we just created
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak();
        // create object cheetahObject
        // this how we created a cheetah object or any other object
        Animal cheetahObject = new Animal();
        cheetahObject.type = "cheetah";
        System.out.println(cheetahObject.type);
        cheetahObject.eat("meet");

    }
}
