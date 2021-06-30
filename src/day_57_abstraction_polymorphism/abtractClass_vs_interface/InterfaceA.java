package day_57_abstraction_polymorphism.abtractClass_vs_interface;
/*before java 8, interface was pure abstraction, only abstract methods were allowed. public abstract is automatically added,
 so it is optional to type it: void absMethod(int num); is enough
 Starting from java 8, static methods are allowed in interfaces!
 */
public interface InterfaceA {
    /*
    constants
    interfaces can only be public access modifier  for all variables and methods!
     */


    public static final String TYPE = "interface";
    double MAX_COUNT = 500; //<<--- this is also public static final

 /*
 *error:Interfaces cannot have constructors!

    public InterfaceA(){

    }
 */


    public abstract void absMethodD(int num);   // <<--- abstract method
    /*
     staring from java 8(jdk 1.8)
     interface can have static and default methods
     */
    public static void staticMethodE(String str){ // static method need to have implementation. static methods can also have a body!
        System.out.println("staticMethodE is called with str - "+ str);
    }
  // default method has a body. Abstract method don't have a body!
    public default void defaultMethodF(){ //<<--- default method is a method with a body in the interface!
        System.out.println("defaultMethodF is called");
    }
}
