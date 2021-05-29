package day_35_methods_with_param;

import java.util.Scanner;

public class MultipleParameters {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
     //   showSum(10,20);
        showSum(d1,d2);


    }
    public static void showSum(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("The Sum = " +sum);
    }

}
