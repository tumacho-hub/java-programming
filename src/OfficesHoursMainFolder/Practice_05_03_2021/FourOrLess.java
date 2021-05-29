package OfficesHoursMainFolder.Practice_05_03_2021;



import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    /*
    Given an ArrayList of Strings, go through and read only Strings that are 4 Characters or less.
    Take those Strings and put them into a different ArrayList.

     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple","java","tree","cat","animal","shortcut"));

        ArrayList<String> list2 = new ArrayList<>();

        for (String each : list){

            if (each.length() <= 4 ){
                list2.add(each);
            }
        }
        System.out.println(list2);

    }
}
