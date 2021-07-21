package personal_Training_Starts_7_20_2021;

import java.util.Scanner;

/*
Given the following information: hourly rate, weekly hours, and number of weeks.
Check if all the inputs are valid and then calculate the salary.
-hourly rate cannot be negative or zero
-> If invalid print: Hourly Rate cannot be Negative or Zero
-weekly hours cannot be zero, negative or more than 65
-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
number of weeks cannot be less than 1 and more than 52
-> If invalid print: Number of weeks cannot be less than 1 or greater than 52
Equation: salary  =  hourly rate *  weekly hours * number of weeks

 */
public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your hourly rate.");
        double hourlyRate = input.nextDouble();

        if (hourlyRate > 0) {
        }else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }
            System.out.println("Please enter your weekly hours");
            int weeklyHours = input.nextInt();
            if (weeklyHours >= 1 && weeklyHours <= 65){
            }else {
                System.out.println("weekly hours cannot be zero, negative or more than 65");
            }
            System.out.println("Please enter number of weeks");
            int weeks = input.nextInt();
            if (weeks > 1 && weeks <= 52 ){
        }else {
                System.out.println("Number of weeks cannot be less than 1 or greater than 52");
            }
        System.out.println("Yearly salary " + (hourlyRate*weeklyHours*weeks));


            }

        }





