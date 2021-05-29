package OfficesHoursMainFolder.Practice_04_13_2021;

import java.util.Arrays;
import java.util.Scanner;

public class smallestAndLongestWordFromArray {
    /*
    Shortest and Longest words from String Array
    Write a program that can return the shortest string element from a string array
    Write a program that can return the longest string element from a string array
    */
    public static void main(String[] args) {

        // get dynamic values from the user and store them in words

        Scanner input = new Scanner(System.in);

        System.out.println("How many words will you enter: ");

        String[] words =  new String[input.nextInt()];
        input.nextLine(); // we add this additional input from scanner to store the first value from scanner!

        for (int i = 0; i < words.length; i++){
            System.out.println("Enter word: " + (i+1));
            words[i] = input.nextLine();


        }
        System.out.println(Arrays.toString(words));
        String[] smallAnLarge = {words[0], words[1]};

        for (String eachWord : words){
            if (eachWord.length() < smallAnLarge[0].length()){
                smallAnLarge[0] = eachWord;
            }
            if (eachWord.length() > smallAnLarge[1].length()){
                smallAnLarge [1]= eachWord;
            }
        }
        System.out.println("Smallest element: " + smallAnLarge[0]);
        System.out.println("SmallAnLarge: " + smallAnLarge[1]);

}


    }
