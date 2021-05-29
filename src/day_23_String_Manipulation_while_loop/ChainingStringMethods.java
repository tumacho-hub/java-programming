package day_23_String_Manipulation_while_loop;

import java.sql.SQLOutput;
import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den spo on";

        System.out.println(word.toUpperCase().toLowerCase().length()); // when chaining it will print the last command!
        // remove spaces first and then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase());
        // selenium.findElement(by.id("hi")).click();

        String city = "istanbul";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

       //  city.isEmpty().touppercase() does not work since isEmpty is boolean
    }
}
