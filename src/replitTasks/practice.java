package replitTasks;
import java.util.*;
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items
Blanket - 60$
Charger - 25$
Hat - 25$
Headphones - 30$
Laptop - 200$
Pants - 50$
Pillow - 40$
Smartphone - 1000$
Socks - 5$
USB cable - 10$
 */
public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();
        int balance = 100;

        if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 60;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 25;
            System.out.println("Your current balance is: " + balance + "$");


        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 25;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 30;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");


        } else if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 60;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 50;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 40;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (item.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 10;
            System.out.println("Your current balance is: " + balance + "$");
        } else {
            System.out.println("Invalid item!");
        }
    }

}


