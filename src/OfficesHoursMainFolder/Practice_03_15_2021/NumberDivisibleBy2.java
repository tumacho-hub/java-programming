package OfficesHoursMainFolder.Practice_03_15_2021;
import java.util.Scanner;
/*
 Create a program that will accept a number and it will print if it is evenly divisible by 2 ,3 and 5.
 Ex:
  Output:
  65 is divisible by 2: false
  65 is divisible by 3: false
  65 is divisible by 5: true
 */
public class NumberDivisibleBy2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        input.nextDouble();

        int number = 0;
        boolean by2 = number % 2 == 0;
        System.out.println("Number it is divisible by 2 =" + by2);

        input.nextDouble();
        boolean by3 = number % 3 == 0;
        System.out.println("Number it is divisible by 3 =" + by3);

        input.nextDouble();
        boolean by5 = number % 5 == 0;
        System.out.println("Number it is divisible by 5 =" + by5);

          }


        }



