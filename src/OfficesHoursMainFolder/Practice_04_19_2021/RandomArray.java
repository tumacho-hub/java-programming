package OfficesHoursMainFolder.Practice_04_19_2021;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
/*
Challenge: Random Array
1) Ask the user to enter how many numbers they want in their array
2) Ask the user the max number they want for the random numbers -Use this as the boud
for  your random number
3)Create an int array with random numbers. The number of elements is based on the given number
Flow:
How many numbers do you want: 5
What is the max number value: 50
->Print the array with 5 random numbers from 0 to 50
 */

    public static void main(String[] args) {
        int[] a = getRandomArray(5, 500);
        System.out.println(Arrays.toString(a));


    }

    public static int[] getRandomArray(int size, int maxRandomNumber) {
        Random random = new Random(); // this is how we generate a random nu,ber by using the RANDOM METHOD
        // overloaded method! means same method with different parameters

        int[] arr = new int[size]; // using the my parameter size to figure the length of the array how many elements do i want
        // we want to generate a number multiple times so we will use a loop
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxRandomNumber + 1); // we adding +1 because we want to read the 50 as well
        }
          return arr;

    }

}
