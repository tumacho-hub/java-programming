package day_57_abstraction_polymorphism.abtractClass_vs_interface;

import java.util.concurrent.Callable;

public class Runner {
    public static void main(String[] args) {
        /*
        We cannot create object (instantiate) neither of them!

        AbstractA abstractA = new AbstractA();
        InterfaceA Inter = new InterfaceA();

        we cannot create objects from the interface class but we can call the static methods because static methods
         don't need object they can be call directly from the method only static methods!
        */

        InterfaceA.staticMethodE("wooden spoon");
       //  ConcreteA.staticMethodE("hello"); this will not work
    }
}
