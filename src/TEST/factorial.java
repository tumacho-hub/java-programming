package TEST;

import java.util.Scanner;

public class factorial {
    /*
    In mathematics a factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.
     Calculate factorial and output result to the console.
     example of the factorial is the number itself by decrementing until 1
     example of factorial number is  5! = 5*4*3*2*1 it multiplies by the result it getting into hit 1.
     5! 5*4=20*3=60*2=120*1=120 this is the factorial of 5
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1l;
        // we created this variable to to store our new value of the loop because it needs to keep multiplying until the last iteration!

        for (int i =n; i >= 1; i--){
// so the result from the result will get reassigned back to the result from the firs factorial.
        result = result * i;
        }
        System.out.println(result);



    }
}
