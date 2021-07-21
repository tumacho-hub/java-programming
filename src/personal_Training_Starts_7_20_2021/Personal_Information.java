package personal_Training_Starts_7_20_2021;

import java.util.Scanner;
/*
Give values yourself to test, but if you want to make it more dynamic and challenging add Scanner.
 Variables, Data types, Print statement, Concatenation, Scanner.
 [Personal Information -Scanner and If].
 Ask the user how many people they live with?
 if user lives with Less than 2 people: print "Live with less than 2 people"
 if the user lives with 3 -6 people: print "Live with 3 -6 people"
 if the user lives with more than 6 people: print "Live with "more than 6 people"
 Ask the user what city they live in?
 Ask the user if the live in downtown ("yes or no")
 if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
 if they have thought about it print "do it its great", if they have not print "You should think about it"
 Ask the user their favorite animal?
 Print "Wow %animal is a great animal"Ask the user how many pets they want?
 Print "Interesting, do you want %numberOfPets %favoriteAnimals?
 */

public class Personal_Information {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many people they live with?");
        int user = input.nextInt();
        if (user >= 6) {
            System.out.println("Live with more than 6 people");
        } else if (user >= 3 && user <= 6) {
            System.out.println("Live with more 3-6 people");
        } else if (user <= 2) {
            System.out.println("Live with less than 2 people");
        }
        System.out.println("What city they live in?");
        input.nextLine();
        String city = input.next();

        System.out.println("Do you live DownTown? Yes or no");
        String yesOrNo = input.next();

        if (yesOrNo.equalsIgnoreCase("yes")) {
            System.out.println("have you thought about moving to the suburbs? yes or no?");

            String yesOrno = input.next();

            if (yesOrno.equalsIgnoreCase("yes")){
                System.out.println("Do it its great");
            }else {
                System.out.println("You should think about it");
            }

            System.out.println("What is your favorite animal?");
            String animal = input.next();
            System.out.println("Wow " + animal + " is a great animal");

            System.out.println("How many pets you want?");
            int pets = input.nextInt();

            System.out.println("Interesting, do you want " + pets + " number of pets " + animal + " favorite animals");

        }
    }
}
