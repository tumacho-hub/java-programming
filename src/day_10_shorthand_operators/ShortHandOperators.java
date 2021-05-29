package day_10_shorthand_operators;

import java.sql.SQLOutput;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot  = " + cars);
        cars += 5; // this is edding or short cut for cars = cars +2
        System.out.println("cars in parking lot = " + cars);
        // 6 cars left the parking lot
           cars -= 6;///// cars = cars - 6;
        System.out.println("cars in parking lot  = " + cars);

        cars = cars - 1;
        cars -= 1;
        System.out.println("cars in parking lot = " + cars);
        int electricCars = 13;
        //cars = cars + electricCars;
        System.out.println("electricCars = " + cars);
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);

        String word = "java";
        System.out.println("word = " + word);

        word = word + "programming";
        System.out.println("word = " + word);
        //add " is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String Selenium = " but \"selenium\" is more fun";
        word += Selenium;
        System.out.println("word =" + word);

        char letter = 'A';
        System.out.println( "letter =" + letter);
        letter +=3;
        System.out.println("letter = " + letter);
        // add j to letter
        letter += 1;
        System.out.println("letter =" + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50 off
        //parkingFee = parkingFee / 2; //we can use shorthand
        parkingFee /= 2;
        System.out.println( "early bird parking fee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);

        //SHORTHAND OPERATORS
        // +=  -=  *=  /=   %=
        //INCREMENT/DECREMENT OPERATORS:
        // ++  --
        //++,  -- only increase or decrease value of variable by1.
        //int count = 2
        //count++;//<-- add 1 to the variable
        //count++; each

        // 3 ways toadd/minus 1 from variable:
        // int num = 10;
        //num = num + 1;
        //num += 1;
        //num++;
        //++num;
        // all of the those statements above are adding 1 to the value of num.







    }
}
