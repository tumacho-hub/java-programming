package OfficesHoursMainFolder.Practice_03_29_2021;

public class MiddleChar {
    /*
    [Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
     */
    public static void main(String[] args) {


        String word = "unity";


        if (word.length() % 2 == 1 ){ // word is odd



            System.out.println(word.charAt(word.length()/2));


        }else {
             // even word


            int index = word.length() / 2; // in this case we are declaring a new variable because we need the info



            System.out.println(word.charAt(index-1) + "" + word.charAt(index));


        }
    }
}
