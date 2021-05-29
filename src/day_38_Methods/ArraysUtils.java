package day_38_Methods;

import java.util.concurrent.LinkedTransferQueue;

public class ArraysUtils {
    public static void PrintArrays(int[]nums){
        for (int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static int sum(int[] sums){
        int sum =0;
        for (int sumseach : sums){
            sum += sumseach;

        }
        return sum;
    }

    public static boolean contains(int[] nums, int nums1){
        boolean found = false;
         for( int each : nums ){
            if (each==nums1){
                found =true;
                break;
            }
         }
               return found;
    }

}
