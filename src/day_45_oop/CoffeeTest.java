package day_45_oop;

import com.sun.javaws.IconUtil;

public class CoffeeTest {
    public static void main(String[] args) {

        coffee myCoffee = new coffee();

        System.out.println("coffee amount = " + myCoffee.getAmount());

        myCoffee.refill();

        System.out.println("Amount after refill = " + myCoffee.getAmount());

        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());

       // myCoffee.type = "Turkish coffee";  lets use the method instead
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

//
        coffee coffee1 = new coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        coffee coffee2 = coffee1;
        System.out.println("coffee type = " + coffee2.getType());

        coffee coffee3 = new coffee();
        coffee3.setType("Frappuccino");
        System.out.println("coffee type = " + coffee3.getType());
        coffee3 = coffee2;
        System.out.println("Coffee3 type  " + coffee3.getType());

        coffee coffee4 = null;




    }
}
