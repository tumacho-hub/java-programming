package day_31_Arrays;

import java.util.*;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {

        int [] nums = {33, 55, 123, 400, 1 };
        System.out.println(Arrays.binarySearch(nums,33));
        System.out.println(Arrays.binarySearch(nums,123));
        System.out.println(Arrays.binarySearch(nums,85));
        System.out.println(Arrays.binarySearch(nums,455));
      //  Arrays.binarySearch(nums, 55);
      //  System.out.println();
       // Arrays.binarySearch(nums, 400);
       // Arrays.binarySearch(nums, 40);
       // Arrays.binarySearch(nums, 33);

        // check if number 12345 is among number is array
        if (Arrays.binarySearch(nums, 12345) > 0 ) {
            System.out.println("12345 is present in array ");
        } else {
            System.out.println("12345 is not present");
        }

    }
}
