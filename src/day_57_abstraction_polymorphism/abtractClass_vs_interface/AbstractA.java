package day_57_abstraction_polymorphism.abtractClass_vs_interface;
/*
 Abstract class can have abstract- non-abstract and static methods
 in Abstract classes- All modifiers are allow for variables, static and instance methods.
 private > default > protected > public
 */
public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "java";
/*
// this is a constructor because is matching the class name and does not have a returning type also is public..
Abstract classes can have constructors
 */
    public AbstractA(){
        System.out.println("AbstractA constructor");

    }



   //  private abstract void absMethodA(); // <<-- abstract methods cannot be private, static. final

    public abstract void absMethodA(); // <-- this an abstract method!!! no need for curly braces!

    public void methodB(){   //<<--- non-abstract method
        System.out.println("methodB called");
    }
    public static void staticMethodC(){ //<<<------- static method
        System.out.println("Static methodC is called");
    }

}
