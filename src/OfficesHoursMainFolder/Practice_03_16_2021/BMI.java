package OfficesHoursMainFolder.Practice_03_16_2021;
/*
BMI: program will ask a user to enter their mass (kilogram) and  their height (meters).
calculate their BMI and then print the appropriate message based on the provided vales:
All numbers taken as doubles
 BMI => Formula: mass / height^2
 Values =:
 Less than 18.5 - Under weight
 From 18.5 to 25 -Normal weight
 From 25 to 30 - overweight
 More than or equal to 30 -obese
 */
import java.util.*;
public class BMI {
    public static void main(String[] args) {
        double mass = 62.4; // number are after conversion
        double height = 1.65;
        double BMI = mass / (height * height);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal Weight ");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Over Weight");

        } else {
            System.out.println("Obese");
        }
    }
}



