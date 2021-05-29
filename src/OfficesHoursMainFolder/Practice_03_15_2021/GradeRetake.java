package OfficesHoursMainFolder.Practice_03_15_2021;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Write a program that will give the grade after the retake. The program should read a score of the test and which
attempt it was.

if it is the first attempt -> subtract 10%
if it is the second attempt -> subtract 20%
if it is the third attempt -> subtract 35%
 */
public class GradeRetake {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade");
        int baseGrade = input.nextInt();

        System.out.println("Enter  number of Attempts");
        int numbersOfAttempts = input.nextInt();
         int retakePenalty = 0;

        if (numbersOfAttempts == 1){
            retakePenalty = (int)(baseGrade * .10);

        }else if (numbersOfAttempts == 2){
            retakePenalty = (int)(baseGrade * .20);

        }else if (numbersOfAttempts == 3){
            retakePenalty = (int)(baseGrade * .35);

        }else{
            System.out.println("No more than three attempts allowed");

        }
        System.out.println("Grade after attempt " + numbersOfAttempts + "was: " + (baseGrade - retakePenalty));

    }

}
