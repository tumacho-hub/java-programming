package day_18_conditions_practice_Strings;

import javax.swing.*;

public class FizzBuzz2 {
    public static void main(String[] args) {
        int numb = 7;
        if (numb % 3 == 0 && numb % 5 == 0 ) {
            System.out.println("FIzzBuzz");
        }else if (numb % 3 == 0){
                System.out.println("Fizz");
            }else if (numb % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Not divisible");


        }
    }
}
