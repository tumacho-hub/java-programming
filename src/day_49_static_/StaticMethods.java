package day_49_static_;

import java.util.Enumeration;

public class StaticMethods {
// this is method below exa:
   // none static variable
    int num =10;
   static int count =5;

    public static void displayMessage(String  message){
        System.out.println("message: " + message);
   //     System.out.println("num " + num); // error because num is instance variable . none static variable
        System.out.println("num = "+ count);


    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("Wooden spoon");

    }
    //  instance method always need a object to call.. we need to create an object
    // stm.instanceMetho()
    public void instanceMethod(){

        System.out.println("instanceMethod");
        System.out.println("nums = " + num);
        System.out.println("count = " + count);
        System.out.println("hello from instance method " );
    }

}
