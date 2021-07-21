package personal_Training_Starts_7_20_2021.stringPractice;

import java.util.Locale;
import java.util.Scanner;

/*
Given a String, write a program to display the middle character of a string
a)  If the length of the string is even there will be two middle characters.
b)  If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
 */
public class MiddleChar {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.nextLine();

        if (word.length() % 2==1){
            System.out.println(word.charAt(word.length()/2));

        }else if (word.length() % 2 == 0){
            System.out.println(""+ word.charAt(word.length()/2-1) + word.charAt(word.length()/2));
        }

        }
    }






