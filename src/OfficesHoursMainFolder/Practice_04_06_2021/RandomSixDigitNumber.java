package OfficesHoursMainFolder.Practice_04_06_2021;
import java.util.*;
public class RandomSixDigitNumber {
    /*
    Challenge this will may be difficult but try it. don't spend too much time
    Generate a random number that is six digits long. Each digit in this number should be unique ,
    meaning the number 6 digit number should have 6 different  Character numbers that make it up.
    Print the number.
    Hints: Loops , String, Random.
     */
    public static void main(String[] args) {
        Random random = new Random();
        String randomNumber = "";

        /// for this task we using a while loop because we don't know how many times we need to run this loop!!
        // it will run infinity times this is why while loop is best for this task!

        while( randomNumber.length() != 6){

            int eachRandom = random.nextInt(10);

            if (!randomNumber.contains(""+eachRandom)){
                randomNumber += eachRandom;
            }




        }
        System.out.println("randomNumber" + randomNumber);
    }
}
