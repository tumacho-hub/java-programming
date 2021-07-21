package personal_Training_Starts_7_20_2021;

import java.util.Scanner;

/*
[Qualification For Army]
Given information: Citizenship(String), resident (boolean), and has high school diploma (boolean), and age(int).
Determine if the person is qualified to join the army.
-The person must be a Citizen of the USA or a resident->
If not print: You must be a U.S. citizen or a resident
-Their age must be between 18 and 35->
 If not print: Your age must be between 18 to 35 years old
 -They must have a high school diploma->
 If not print: You must have a high school diploma
 > If all the criteria is met print: You are qualified for the US Army
 */
public class Army_Qualification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qualification for the Army");
        System.out.println("Are you a Citizen of the USA or resident");
        String citizenship = input.nextLine();

        if (citizenship.equalsIgnoreCase("no")) {
            System.out.println("You must be a U.S citizen or resident");
        } else {
            System.out.println("Welcome ");
            System.out.println("How old are you?");
            int age = input.nextInt();

            if (age < 18 || age > 35) {
                System.out.println("Your age must be between  18 to 35 years old ");

            } else {
                System.out.println("You almost done with the application!");
                System.out.println("Do you have a High School Diploma?");
                boolean highSchoolDiploma = input.nextBoolean();

                if (highSchoolDiploma == false) {
                    System.out.println("You must have a High School Diploma");
                } else {
                    System.out.println("You are qualified for the US Army.");
                }

            }


        }
    }
}
