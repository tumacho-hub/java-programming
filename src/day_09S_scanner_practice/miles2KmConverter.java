package day_09S_scanner_practice;
import java.util.Scanner;
public class miles2KmConverter {
    public static void main(String[] args) {
        // miles/kilometers
        //enter miles: 10,
        //miles in kilometers: 1.609
        //Kilometers-> miles * 1.609

        Scanner scan  = new Scanner(System.in);
        System.out.println("miles to km converter?");
        System.out.println(" enter miles: ");
        //double miles = 10.0;
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles +"  miles in kilometers " + kilometers);







    }
}
