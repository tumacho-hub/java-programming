package day_20_string_manipulation;
// below import statement is automatically added to each class by compiler
import java.lang.*; //import all classes from java.lang package
import java.util.Scanner;

public class StringCreationMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:" );
        int  num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();


        if (num1 < num2 || num2 < num3){
            System.out.println("Medium value is: " + num2);
        }


    }
}
