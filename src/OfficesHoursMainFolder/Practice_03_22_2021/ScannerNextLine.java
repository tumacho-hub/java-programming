package OfficesHoursMainFolder.Practice_03_22_2021;
import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int number = input.nextInt();
        System.out.println("enter a word");
        /// we need to add the a new scanner line =  "input.nextLine" to accept the value and work properly otherwise code will not work as expected
         input.nextLine(); // additional line that needs to be add it.
         String word = input.nextLine();

        System.out.println(number);
        System.out.println(word);


    }
}
