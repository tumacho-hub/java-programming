package day_42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
 /*
 method : printStringList
 param: list of string
 return: void
 print all the values separated by space in same line
 this is how you created a method with arrayList
  */
        //this code above runs base on our method we created below!!
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a");words.add("input"); words.add("title");

        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br","python","sql","api"));


        List<Integer> nums = Arrays.asList(23,54,23,54554,234,11,5,2);
        int sum = sumIntegerList(nums);
        System.out.println("sum of numbers = " + sum);

    }
        public static void printStrList (List<String> stringList) {

        for( String str : stringList){
            System.out.print(str + " ");
        }
            System.out.println();
    }

    /*
    method: sumIntegerList
    param: List of integers
    returns int
    calculate sum of integers in the list then returns
     */
    public static int sumIntegerList(List<Integer> list) {

         int sum = 0;

         for (int i : list){
             sum+= i;

         }
         return sum;
    }

}

