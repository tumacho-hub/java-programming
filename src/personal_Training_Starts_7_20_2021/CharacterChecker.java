package personal_Training_Starts_7_20_2021;

import java.util.Scanner;

/*
Given a letter (char) determine if the character is an uppercase letter or lowercase letterEx:
'b'  --> lowercase
'G' --> uppercase
'O'  --> uppercase
 */
public class CharacterChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a character");
        char letter = input.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is a uppercase  letter");
        }else if(letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is a lowercase letter");
        }else{
            System.out.println(letter + " is not a valid letter");
        }


    }

}
