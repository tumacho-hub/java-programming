package OfficesHoursMainFolder.Practice_04_07_2021;

import day_21_string_manipulation.charAt;

public class DuplicateCharacters {
    /*
    IQ Duplicates Characters
    Given s String, find out and print the duplicate characters. A character is duplicate if it appears more than
    once in the string.
    Ex: AAABCCDEEF
    Output: ACE
     */
    public static void main(String[] args) {


        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++){
            int count = 0;

            if (checked.contains(""+ str.charAt(i))){
                continue;

            }
        }
    }
}
