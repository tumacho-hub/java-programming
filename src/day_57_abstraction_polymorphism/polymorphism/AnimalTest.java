package day_57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();// not polymorphism, because data type and object type are the same
        animal.makeNoise();
    /*
        //Polymorphism - polymorphic way:
         //parent type = new child type
         polymorphism: the ability of the object to take many forms.
         Variable data type/reference type can be parent class or interface,
         object data type can be any of sub classes
     */

        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();

        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();
/* Below lines are the list of objects. List data type is parent class.
// objects are any of child classes
Variable or list data type is parent class and objects are any one of the sub classes
 */

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for (Animal each : listOfAnimals){
           each.makeNoise();
        }

    }
}
