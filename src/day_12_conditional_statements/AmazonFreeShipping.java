package day_12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        /* add main method
        import scanner
        create scanner object
        ask "enter total price"
        assign value to totalPrice from scan.nextDouble.

         If totalPrice is more than or equal to 25
         print " FREE SHIPPING ELIGIBLE. your order---

         public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price: ");
        double totalPrice = scan.nextDouble();

        if(totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total : $" + totalPrice);
        }else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalPrice + " less than minimum of $25.");
         */
   Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price:");
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25.0) {
            System.out.println("Free Shipping eligible. your order total: $ "+ totalPrice);

        }else{
            System.out.println("not eligible for free shipping. your order total: $" + totalPrice);
        }
        System.out.println(" thanks for shopping amazon");
    }
}
