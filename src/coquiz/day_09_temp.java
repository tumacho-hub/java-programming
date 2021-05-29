package coquiz;
import java.util.Scanner;

public class day_09_temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome message ### F to C Converter Program ###");
        System.out.println("Enter Fahrenheit value?");
        double fahenheitTemp = scan.nextDouble();
        double celsiusValue = (fahenheitTemp - 32) * 5 / 9;
        System.out.println("In Celsius:"+ celsiusValue);
    }
}
