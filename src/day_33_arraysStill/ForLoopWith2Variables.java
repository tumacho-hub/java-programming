package day_33_arraysStill;

import java.util.Arrays;

public class ForLoopWith2Variables {
    public static void main(String[] args) {

        int[] nums = {5, 10, 151, 86, 93, 55, 73};
        int[] numsReverse = new int[nums.length];
        //System.out.println(nums.length);
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            // System.out.println(nums[i]);
            numsReverse[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsReverse));
        System.out.println("---------------- Straight 2 way for loop ---------");
        for (int i = 0, j = 1; i <= 4; i++, j++) {
            System.out.println("i = " + i + ", j = " + j);

        }
        System.out.println("--------Reverse loop--------------");
        for (int i = 1, j = 5; j >= 0; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
        }


