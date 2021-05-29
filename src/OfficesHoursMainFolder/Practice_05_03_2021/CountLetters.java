package OfficesHoursMainFolder.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    /*
    Count Letters (Similar to Target word, but different layer)
    Given an ArrayList of Strings and a letter (char)
    print how many times the letter is found in the ArrayList elements
    Ex:Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”letter: ‘a’
     */
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));

        char targetLetter = 'a';
        int count = 0;

//         first approach resolved code

//        for ( String word : words){
//
//            for (int i = 0; i < word.length(); i++){
//
//                if (word.charAt(i) == targetLetter){
//                    count++;
//
//                }
//
//            }
//
//
//
//   }

        // second approach below in how to make it..

        for (String word : words) {
            count += letterInWord(word, targetLetter);


            //
        }
        System.out.print(targetLetter + " was found " + count + " times");

    }

    public static int letterInWord(String word, char target) {
//                int count = 0;
//                for( int i = 0; i < word.length(); i++){
//                    if (word.charAt(i) == target){
//                        count++;
//                    }
//
//        }
//                return count;
//     we can also made a each loop this is how we build it!

        int count = 0;
        for (char each : word.toCharArray()) {
            if (each == target)
            count++;
        }
            return count;
        }

    }


