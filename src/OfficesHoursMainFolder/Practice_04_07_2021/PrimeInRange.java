package OfficesHoursMainFolder.Practice_04_07_2021;

public class PrimeInRange {
    /*
    [IQ] Prime in rangeGiven a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.
    Ex:Input: 50
    output:
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
     */
    public static void main(String[] args) {

        int number = 50;



        for (int j = 2; j <= number; j++) {
            boolean isPrime = true;

            for (int i = 2; i < j; i++) {

                if (j % i == 0) {
                    isPrime = false;
                    break;


                }
            }
            if (isPrime)
            System.out.print(j + " ");


        }
    }
}
