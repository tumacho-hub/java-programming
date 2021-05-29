package day_33_arraysStill;

import java.util.Arrays;

public class ReviewSplit<sout> {
    public static void main(String[] args) {
      /*  String word = "java programing";
        String[] wordArray = word.split("a");
        System.out.println(Arrays.toString(wordArray));

       */

        String word1 = "java";
        String[] wordsArray = word1.split("a");
        System.out.println(wordsArray.length);
        int countOfA = wordsArray.length - 1;
        if (word1.endsWith("a")) {
            countOfA++;

        }
        System.out.println("count of a " + countOfA);

        System.out.println("---------- new example --------");

        String letter = "java";
        String[] letterNew = letter.split("");

        System.out.println(letterNew[0]);
        System.out.println(letterNew[1]);
        System.out.println(letterNew[2]);
        System.out.println(letterNew[3]);

        String example = "java1sql2tml4sql";
        String[] exampleArray = example.split("\\d");
        System.out.println(Arrays.toString(exampleArray));

        example = example.replaceAll("\\d", "_");
        System.out.println("Example = " + example);

        String password = "Jorgito12@19";
        if (password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")) {
            System.out.println("valid password ");
        } else {
            System.out.println("invalid password ");

        }
    }
}
