package day_33_arraysStill;

import java.util.Arrays;

public class ReverseArrayLongWay {
    public static void main(String[] args) {
        //                 0  1  2  3              reverse length
        int[] numbers = {32, 55, 98, 125,};
        int[] numsRev = new int[numbers.length]; // {0,0,0,0}
        // two variables i=3            j = 0
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            numsRev[j] = numbers[i];
            //   System.out.print( numbers[i] + " ");

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numsRev));

    }







}
