package day_24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        // import = "instantiate Scanner" -> same as import
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 5678;
        int pinCode ; // 5678 leave it on blank is better way to code it



        do {
            System.out.println("Enter pin code");
            pinCode = scan.nextInt();  // if you declare variables inside the curly braces its only visible within the block!
        }while(pinCode != secretPinCode);
        System.out.println("Welcome to your account");
    }
}
