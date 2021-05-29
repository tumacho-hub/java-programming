package OfficesHoursMainFolder.Practice_03_23_2021;
import java.util.Scanner;
public class NestedWithScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > 0) {

            System.out.println("Enter a single word");
            String word = input.next();

            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length");

            } else {
                System.out.println(word + " is odd length");

            }

        } else {
              /*
    [Character Checker]
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
        'G' --> uppercase 'O' --> uppercase
        Hint: Use the ASCII table
     */


            System.out.println("Enter a character");
            char letter = input.next().charAt(0);

            // the example below explain two different ways  with ASCII table and without.
            if (letter >= 65 && letter <= 90){ // second way to declare it  if (letter >= 'A" && letter <= 'Z')
                System.out.println(letter + " is a uppercase letter");

            }else if (letter >= 97 && letter <= 122){ // same situation here if(letter >= 'a' && letter <= 'z')
        System.out.println(letter + " is a lowercase letter");
        }else{
            System.out.println( letter + " is not a valid letter");
        }
    }
}
    }
