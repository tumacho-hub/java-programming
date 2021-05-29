package OfficesHoursMainFolder.Practice_03_31_2021;

public class CountUpperLowerOrNumber {
    /*
    Count upper,  lower, and numbers.
    Given a string, find and print how many uppercase letter, lowercase letter, and number are in the string.
    EX:
    Input: 2juMp41EEkd4s4
    output:
    3 uppercase
    6 lowercase
    5 numbers
     */
    public static void main(String[] args) {
        String givenWord = "2juMp41EEkd4s4";
        int upperCase = 0, lowerCase = 0, number = 0;

         for (int i = 0; i < givenWord.length(); i++){

             char eachLetter = givenWord.charAt(i); // we need this variable inside the loop because the i is within the block!

             if ( eachLetter >= 'A' && eachLetter <= 'Z' ){
                upperCase++;

             }else if ( eachLetter >= 'a' && eachLetter <= 'z'){
                 lowerCase++;

             }else if (eachLetter >= '0' && eachLetter <= '9' ){
                 number++;

             }

         }
        System.out.println("Uppercase = " +  upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("number = " + number);




    }
}
