package OfficesHoursMainFolder.Practice_03_30_2021;
import java.util.Scanner;
public class MazNumberForm5 {
    /*
    [Max and Mind from 5 ]
    ** Write a program that can ask the user "enter a number " five times and return the max number.
    Write a program that can ask the user "enter a number" and return the minimum number..
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
       int max = first;
       int minimumNumber = first;
        for (int i = 0; i < 4; i++){
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > max){
                max =  num;

                if (num < minimumNumber){
                    minimumNumber = num;
            }

              }
          }
        System.out.println("max nunmber is = " + max);
        System.out.println("Minimum number =  " + minimumNumber );
        }


    }

