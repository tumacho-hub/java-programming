package OfficesHoursMainFolder.Practice_03_30_2021;

public class PrefixAgain {
    /*
    Given a String str and number n check if the prefix (made of up of the first n character)
    appears in the remaining part of the string. Print true or false.
    Assume that the String is not empty and that n is in the range from 1 to str.length().
    Examples:
    input: abXYabc
    input : 1
    output : true
     */
    public static void main(String[] args) {
//  Since we are looking for a prefix we should assume we have an x word to start the code

        String str =  "abXYabc";
        int n = 1;        // 1
        //                // a bXYabc
        // let's find out our  prefix by creating a variable but we don't really need it its to help our coding!

        String prefix = str.substring(0,1); // we using substring because we are looking for the prefix of our given word
        // substring is feats that category to adapt to the prefix ..

String remaining = str.substring(n); // this variable will determine the value of our index
        System.out.println(remaining.contains(prefix));




    }
}
