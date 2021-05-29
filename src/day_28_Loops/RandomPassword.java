package day_28_Loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String  password = "";

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijlomnopqrtuvwxyz0123456789_!@#$%^&*";

        // System.out.println(random.nextInt(21));
        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(69);
            System.out.print(source.charAt(index));
            password += source.charAt(index);
            //System.out.println(random.nextInt(source.length()));


        }
        System.out.println("\nYour password = " + password);

    }
}

