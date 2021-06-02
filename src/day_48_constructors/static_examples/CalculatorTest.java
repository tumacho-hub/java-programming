package day_48_constructors.static_examples;

import java.util.concurrent.Callable;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator.add(5,3); // add is static method, can be called using Classname,staticMethodName
        // Static way of calling the method

    //     Calculator.multiply(3,4); error because it not static. need to create an object to call it..
   // by using new keyboard like example below
    Calculator calcObject = new Calculator();
    calcObject.multiply(2,4);

    calcObject.add(2,5);





    }
}
