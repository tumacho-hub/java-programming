package OfficesHoursMainFolder.Practice_07_19_2021;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
* Create a method that will accept a String and returns a String with the duplicate instances of characters removed

Ex:
    Input: "AAABBBCCCD"
    Output: ABCD
____________________________________________
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicateChars("AAABBBCCCD"));

    }

    public static String removeDuplicateChars(String str) {

        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        return  set.toString();


    }

}

