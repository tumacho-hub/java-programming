package OfficesHoursMainFolder.Practice_04_19_2021;
import java.util.*;
import day_38_Methods.StringUtils;

public class ReverseEachWord {
    /*
    Given a string, reverse each individual word and print the result
    Hint: Use a nested loop, split
    Input:
    It started to snow in Chicago
    Output:
    tl detrats ot wons ni ogacihC
     */
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));



        }

    public static String reverseEachWord(String str){

        String reverse = "";
// here we would reverse each String with a for loop
// going from the last index to the first index
        for (String each : str.split(" ")){// we used split to separate our elements in array


            reverse += StringUtils.reverse(each) + " ";


        }
        return reverse;



    }
}
