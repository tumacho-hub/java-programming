package java_java_final;


import java.util.*;

public class Array_syntax {

    public static void main(String[] args) {
        // how to sort an array

        int[] intArray = {2, 15, 7, 1, 3};
        Arrays.sort(intArray);
        for (int each : intArray) {
            System.out.println("Number " + each);
        }

        // second option to sort an Array, the print will be different because I'm printing it toString format
        System.out.println();
        int[] ints = {2, 15, 7, 1, 3,};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        System.out.println();

        String[] names = {"john", "adam", "don"};
        Arrays.sort(names);
        for (String eachName_name : names) {
            System.out.println("Names " + eachName_name);

        }


    }
}


