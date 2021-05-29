package OfficesHoursMainFolder.Practice_03_23_2021;

public class ThreeStringsLetter {
    public static void main(String[] args) {
        /*
Given three String variables of some text find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.

         */
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "more";
        String character = "a";
        // this new additional variable that we adding is an idea where we are going to store our final result
        // start getting use to it, because it will be using it a lot in the future ..

        String biggestWordWithA = ""; // we are declaring a empty variable so we store the final result
        // in this case we are using this new variable to check, compare and store the largest word in it..

        // keep in mind we are checking two things, is the length more than, and if the words contains "A"
        // this is how we do it EXA:

        //  example below we using "biggestWordWithA" to compare and store our value process of elimination!
        if (word1.contains(character) && word1.length() > biggestWordWithA.length()) {
            biggestWordWithA = word1;  // now the "biggestWordWithA" becomes "java"!

//also for this case we using SINGLE IF STATEMENTS because we are using boolean expressions to compare values


        }
        if (word2.contains(character) && word2.length() > biggestWordWithA.length()) {
            biggestWordWithA = word2;

        }

        if (word3.contains(character) && word3.length() > biggestWordWithA.length()) {
            biggestWordWithA = word3;
        }
        if (biggestWordWithA.isEmpty()) {
            System.out.println("No words contains A!");
        } else {
            System.out.println("Longest word with a: " + biggestWordWithA);
        }
    }
}
