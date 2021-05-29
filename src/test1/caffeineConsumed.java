package test1;
import java.util.Locale;
import java.util.Scanner;
public class caffeineConsumed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int nameIndex = email.indexOf("_");
        String name = email.substring(0, nameIndex);
        int lastName = email.indexOf("@");

        String lastN = email.substring(nameIndex+1,lastName );
        int lastDomain = email.indexOf(".");
         String domain = email.substring(lastName+1, lastDomain);
         String capitalN = name.toUpperCase();
          String capitalL = lastN.toUpperCase();


        System.out.println("First name: " + capitalN.substring(0,1) + capitalN.substring(1).toLowerCase());
        System.out.println("Last name: " + capitalL.substring(0,1) + capitalL.substring(1).toLowerCase());
        System.out.println("Domain: " + domain);

    }
    }









