package test1;

import java.util.Locale;
import java.util.Scanner;

public class singleCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        if (message.substring(0,1).equalsIgnoreCase("X")){
            message = message.substring(1);
        }
        if (message.substring(message.length()-1).equalsIgnoreCase("X")){
            message = message.substring(0,message.length()-1);
        }
        System.out.println(message);
    }
}



