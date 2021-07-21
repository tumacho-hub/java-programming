package personal_Training_Starts_7_20_2021.stringPractice;

import java.util.Scanner;

/*
[Remove first and last]
Given two words. Print the first word without its first character then print the second word
without its last character.
Input: apple banana
Output: pple  banan

 */
public class StringPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first word");
        String fruit = input.next();
        System.out.println(fruit.substring(1));

        System.out.println("Please enter the second word");
        String word2 = input.next();
        System.out.println(word2.substring(0, word2.length()-1));

    }
}
