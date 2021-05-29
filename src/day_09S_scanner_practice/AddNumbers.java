package day_09S_scanner_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        //flow:
        //enter 2 numbers
        //5
        //4
        //result:9
        // create scanner object
//        Scanner scan = new Scanner(System.in);
//        // ask question
//        System.out.println("enter 2 numbers");
//        int num1 = scan.nextInt();//5; //exam: scan.nextInt(); it wont work.
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        int result = num1+num2+num3;
//        System.out.println("result " + result);
// in order to use scan we have to declare it as variables
        int onedrink = 1000;
        int grams = 10 * 1000 / onedrink;

        System.out.println( grams);
    }
}
