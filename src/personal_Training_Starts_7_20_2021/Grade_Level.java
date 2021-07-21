package personal_Training_Starts_7_20_2021;

import java.util.Scanner;

/*
Given a grade level (byte) determine and print which school level someone is in.
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
Other: Invalid grade level given
 */
public class Grade_Level {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please the grade leve you wish to know");
        byte gradeLevel = input.nextByte();
        if (gradeLevel >= 1 && gradeLevel <=5 ){
            System.out.println("Elementary School");
        }else if (gradeLevel >= 6 && gradeLevel <= 8){
            System.out.println("Middle School");
        }else if (gradeLevel >= 9 && gradeLevel <= 12){
            System.out.println("High School");
        }else if (gradeLevel >= 13 && gradeLevel <= 16){
            System.out.println("Collage");
        }else if (gradeLevel >= 17 && gradeLevel <= 18){
            System.out.println("Grad School");
        }else {
            System.out.println("Invalid grade leve given");
        }

    }

}
