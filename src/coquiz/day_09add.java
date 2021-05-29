package coquiz;

import java.util.Scanner; // import scanner class

public class day_09add {
    public static void main(String[] args) {
        //flow:
        //enter 3 numbers
        //5
        //5
        //5
        //result:15
        // create scanner object
        Scanner scan = new Scanner(System.in);
        // ask question
        System.out.println("enter 3 numbers");
        int num1 = scan.nextInt();//5; //exam: scan.nextInt(); it wont work.
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int result = num1+num2+num3;
        System.out.println("result " + result);
// in order to use scan we have to declare it as variables

    }
}
