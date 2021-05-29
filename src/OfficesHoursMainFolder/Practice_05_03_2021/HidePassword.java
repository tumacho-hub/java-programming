package OfficesHoursMainFolder.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*
    Given an array of passwords (String). Hide each password as a star(*)
    and show the  hidden password
    Ex:
    Input: { "one", "hidea", "hold",}
    Output: {***, **, ****}
     */
    public static void main(String[] args) {
        String[] password = {"one","apple","hold"};
        ArrayList<String> hiddenPassword =  new ArrayList<>();

        for (String each : password){
            hiddenPassword.add(convertToStars(each));
        }
        System.out.println("original: " + Arrays.toString(password));
        System.out.println("hidden" + hiddenPassword);
    }

        // helper method just a method does some action is called somewhere else
        //basically in other words a method we create to help our coding

        public static String convertToStars (String str){
            String stars = "";
            for (int i = 0; i < str.length(); i++) {
                stars += "*";

            }
            return stars;
        }

    }


