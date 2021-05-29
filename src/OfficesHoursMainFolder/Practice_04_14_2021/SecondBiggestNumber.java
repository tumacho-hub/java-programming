package OfficesHoursMainFolder.Practice_04_14_2021;

public class SecondBiggestNumber {
    /* IQ
    Given an Array of numbers. Find and print the 2nd biggest number. Note the 2nd
    biggest should be unique meaning it should be different from the max number.
    Example:
    input:[ 4,3,1,4,5,2,4,8,4,8]
    output:
    5
     */
    public static void main(String[] args) {

        int [] numbers = {4,3,1,4,5,2,4,8,4,8};
        int max = numbers[0];
        int secondMax = numbers[0];

        for (int eachNum : numbers){

            if (eachNum > max){
                secondMax = max;
              max = eachNum;
            }
            if (eachNum > secondMax && eachNum < max){
                secondMax = eachNum;
            }
        }
        System.out.println("Second max number is: " + secondMax);





    }
}
