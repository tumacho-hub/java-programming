package day_10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month");
        double rent = scan.nextDouble();
        scan.nextLine();//fix the bug known BUG. WORK-AROUND
        String month = scan.nextLine();
        System.out.println("rent= " + rent);
        System.out.println("Month = " + month);
        //REMEMBER WE HAVE A BUG ON THE SYSTEM FOR scan.nextLine

    }
}
