package day_12_conditional_statements;

import java.sql.SQLOutput;

public class ComparisonExamples {
    public static void main(String[] args) {
        /* declare 3 variables,
        currentSpeed-> 45
        SpeedLimit->55
        isSpeeding-> true if speeding,  false if not speeding
        print "Are you speeding? - "
         */

        int speedLimit = 55;
        int currentSpeed = 45;
        System.out.println(speedLimit >= currentSpeed);
        System.out.println(speedLimit < currentSpeed);
        System.out.println("Are you speeding? - " + (speedLimit < currentSpeed));

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        currentSpeed += 20; //this variable += is increasing by 20 **45 + 20=65**

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford -" + (accountBalance >= itemPrice));// true!

        boolean canAfford = accountBalance >= itemPrice;//**don't need to put parenthesis
        System.out.println("can afford = " + canAfford);

        //decrease balance by using shorthand operator

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice; //exam of shorthand operator
        //?isBroke = ?
        boolean isBroke = accountBalance <= 0; // we pick boolean cuz we are comparing
        System.out.println("Am i broke ? - " + isBroke);

        /* ABCDEFG..
          A > B -> A IS CONSIDERED SMALLER THAN B. THE EARLIER IT APPEARS IN ALPHABET
          IT WILL BE SMALLER THAN LATTERS THAT APPEAR LATER IN ALPHABET.
              ALL PROGRAMMING RUN/USE COMPARISON INCREASING ALL THE TIME
         */












    }
}
