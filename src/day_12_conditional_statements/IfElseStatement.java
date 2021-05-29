package day_12_conditional_statements;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

    /*    if(10 > 5){
        System.out.println("Condition is True -> 10 is greater than 5");
        }else{
        System.out.println("condition is False");
        // if+boolean if

       if(10 > 5) {
           System.out.println("condition is true ");

        }else {
           System.out.println("condition is false");
       }
         int count = 25;
          // check if count is more than 30. if yes, print " count is more than 30"
        //otherwise print "count is less than 30"
        if(count > 30) {
            System.out.println("count is more than 30");
        }else {
            System.out.println("count is less than 30");

            byte age = 25;//variable container
            if (age >= 18) {  // boolean **compering** {} curly braces will print as many lines
                System.out.println("Eligible to vote");
                System.out.println("Age is greater or equal to 18");
            } else {
                System.out.println("Not Eligible to vote");
                System.out.println("Age is less than 18");
                // the system will skip from line to line
                //  depending on what the results are **OTHERWISE**
                /* A
                 IF(Condition) {
                 }else {
                 C
                 }
                 D
                 1) condition is true:
                 A **because it is before statement, does not depend on condition.
                 B ** because condition is true
                 C **will not run because is not otherwise **is SKIPPED because condition is true
                 D **because it is before statement, does not depend on condition
                 2) CONDITION IS FALSE
                 A -> because if it is
                 B   **

                 }

                 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = input.nextInt();
        if (cents > 0 && cents < 100){

            int quarters = cents / 25;
            cents %= 25;

            int dimes = cents / 10;
            cents %= 10;

            int nickels = cents / 5;

            int pennies = (cents % 5) / 1;

            System.out.println("Your change is " + quarters + " quarters" + ", " + dimes + " dimes, " + nickels + " nickels" + ", and " + pennies + " pennies");

        }else{
            System.out.println("Invalid cents amount");
        }
    }
}
