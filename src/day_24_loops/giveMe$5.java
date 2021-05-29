package day_24_loops;
import java.util.*;
public class giveMe$5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me $5");
        int dollars = input.nextInt();
        while (dollars != 5) {
            System.out.println("give me $5");
            dollars = input.nextInt();
        }
        System.out.println("thanks for the money");

        System.out.println("lest make a pie ");
        System.out.println(" we need 20 apples to make an apple pie!");
        int apples = input.nextInt();

        System.out.println("i need 20 apples for pie" );
        while (apples != 20) {
            System.out.println("20 apples for an apple pie ");
            apples = input.nextInt();

        }
        System.out.println("we have more than enough! \"Thanks\" ");
    }

}