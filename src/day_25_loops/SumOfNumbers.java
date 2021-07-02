package day_25_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        int sum = 0;

        for (int i = 0; i < count; i++  ) {
            System.out.println(i);
          //  sum+= i; //= 5 // sum+= this variable will add the numbers while the loop runs and store on sum variable

        }
     //   System.out.println("sum = " + sum);
    }

}
