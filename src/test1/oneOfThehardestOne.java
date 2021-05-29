package test1;

import java.util.Scanner;

public class oneOfThehardestOne {
    public static void main(String[] args) {
       
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter first number:");
            int num1 = scan.nextInt();


            System.out.println("Second first number:");
            int num2 = scan.nextInt();


            System.out.println("Third first number:");
            int num3 = scan.nextInt();

            if (num1 < num2 && num2 > num3) {
                System.out.println(num3); // middle
            } else if (num1 < num2 && num2 < num3) {
                System.out.println(num2);
            } else if (num1 > num2 || num2 < num3)
                System.out.println(num1);
    }
}
