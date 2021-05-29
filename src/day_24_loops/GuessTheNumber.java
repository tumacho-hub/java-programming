package day_24_loops;
import java.util.*;


public class GuessTheNumber {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);

       // System.out.println(randomNum.nextInt(101)); is to  get random number by the computer.
        int  secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;
        do {
            System.out.println("guess the secret number");
          //  secretNumber = input.nextInt();
            guessingNumber = input.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("wrong, your number is yoo large");
            }else if(guessingNumber < secretNumber) {
                System.out.println("wrong, your number is too small ");

            }
        }while ( secretNumber != guessingNumber);
        System.out.println( "CONGRATULATION YOU ARE A WINNER!! secret number : " + secretNumber);
        }
    }

