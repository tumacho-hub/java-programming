package day_09S_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String [] args) {
        //// we need this flow:
        //enter price for milk; 3.99
        //enter price for bread: 2.55
        //enter price for cucumbers: 4.10
        //total is 10.33
       //steps, price1, price2, price3, total

       Scanner scan = new Scanner(System.in); //we need this line is KEY
       System.out.println("Enter price of milk: ");
       //double milk = 3.99; //this value is hardcoding
      double price1 = scan.nextDouble();
      System.out.println("Enter price of bread");
      double price2 = scan.nextDouble();
      System.out.println("Enter price of cucumbers");
      double price3 = scan.nextDouble();

      double total = price1 + price2 + price3;
      System.out.println("total price: $" + total);





    }
}
