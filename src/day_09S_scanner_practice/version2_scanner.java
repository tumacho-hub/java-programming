package day_09S_scanner_practice;
import java.util.Scanner;

public class version2_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how old are you?");
       int age = scan.nextInt(); // it will become, int age = 11
       System.out.println(age + " great age! ");
       /// ** scan.close(); optionally close the scanner

    }

}
