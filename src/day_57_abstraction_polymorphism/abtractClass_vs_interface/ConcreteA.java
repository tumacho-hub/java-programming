package day_57_abstraction_polymorphism.abtractClass_vs_interface;

/// first non-abstract child class of Abstract class or interface-is called Concrete class
// Concrete sub class abstract methods from abstract class or interface

public class ConcreteA  extends AbstractA implements InterfaceA, InterfaceB{
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");

    }
    // Sub class can override non-final methods from parents class
    @Override
    public void methodB(){
        System.out.println("methodB overriding version is called");
    }
    ///@Override ---> static methods are hidden! not override

     public static void staticMethodC(){
         System.out.println("staticMethodC hidden version is called");
    }

  //  @Override
    public void absMethodB(int num) {
        System.out.println("absMethodD overridden version is called");

    }

    @Override
    public void absMethodD(int num) {

    }


    }

