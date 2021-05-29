package day_09S_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        //cents -> 123 full amount
        //dollars->  what we looking for
        //remainingCents -> 23
        //Print: in 123 cents:1 dollar 23 cents
Scanner scan = new Scanner(System.in);
System.out.println("Enter cents: ");
        int cents = scan.nextInt();// we are replacing int cents = 255;
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        // in 123 cents ; 1 dollars 23 cents
        System.out.println("In "+ cents + " cents : "+ dollars + " dollars " + remainingCents + " cents");
   ////we just we are refactoring the exiting code to scanner one ** improving or adding additional feature
        //
    }
}
