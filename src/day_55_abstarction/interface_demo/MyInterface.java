package day_55_abstarction.interface_demo;
/*
Interface keyword is use to create an interface in java.
we cannot create object of interface
 */
public interface MyInterface {
    public abstract void learn();

}
/*
Example below
Class implements interface to inherit from it. It does not extend.
Class can implement multiple interface at the same time
*Class can implement multiple interfaces and must override abstract methods of all interfaces.
 */
interface MyInterface2{

}
class MyClass implements MyInterface, MyInterface2{


    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}

class Main{
    public static void main(String[] args) {
   //     MyInterface myInterface = new MyInterface(); <-- ERROR because interface cannot be instantiate. Cannot create object of interface
        MyClass myClass = new MyClass();

    }
}