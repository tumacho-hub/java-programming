package OfficesHoursMainFolder.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfNumbersInList {
    /*
    String number to sun
    Given an ArrayList of numbers in String format, add each digit of each element and store into a
     different ArrayList.
     EX:
     input:
     "123","34","513",
     output:
     [6,7,9]
     */
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>(Arrays.asList("123","34","513"));

        for (int i = 0; i < list.size(); i++){
            int totalSum = 0;
            for (char digit : list.get(i).toCharArray()){
                totalSum += Integer.parseInt("" + digit);



            }
            list.set(i, "" + totalSum);
        }
        System.out.println(list);

    }
}
