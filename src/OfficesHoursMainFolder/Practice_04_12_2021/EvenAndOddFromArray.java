package OfficesHoursMainFolder.Practice_04_12_2021;
import java.util.*;
import java.util.Arrays;

public class EvenAndOddFromArray {
    /*
    Write a program that can count the even and odd number from an array
    of integers use for each to make it easier
    Ex:
    input {4,1,3,12,5]
    output:
    even: 2
    odd: 3
     */
    public static void main(String[] args) {
     //
        //   int[] nums = {4, 1, 3, 12, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you have");
        int [] nums = new int[input.nextInt()];

        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i+1) );
            nums[i] =  input.nextInt();
        }

        int even = 0;
        int odd = 0;
        for (int eachNum : nums ) {
            if (eachNum % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("even = " + even);
       System.out.println("Odd = " + odd);
        System.out.println("--------------- example with array ------------");


// we are counting the number of the even and odd values from that array
int[] evenNumbers = new int[even];

int[] oddNumbers = new int[odd];
/*
 int[] nums = {4, 1, 3, 12, 5};
   i--> keep thrack of the indexes in your nums array !!!
   e--> keep track of the indexes in our oddNumbers array
   o--> keep track of the indexes in our oddNumbers array

    here we go through every element, checks if its even or odd.
    then it will store the number into the even or odd array
    this storage is based omn the E and O variables!!
 */

       for (int i = 0, e = 0, o =0; i < nums.length; i++) {

           if (nums[i] % 2 == 0) {

               evenNumbers[e++] = nums[i]; // post increment is always valid not  pre-increment

           }else{

               oddNumbers[o++] = nums[i];

           }
       }
        System.out.println("Even Arrays " + Arrays.toString(evenNumbers));
        System.out.println("Odd Arrays " + Arrays.toString(oddNumbers));
    }
}


