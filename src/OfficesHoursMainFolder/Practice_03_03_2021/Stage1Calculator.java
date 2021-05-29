package OfficesHoursMainFolder.Practice_03_03_2021;

public class Stage1Calculator {
    /*
    Make a class Stage1Calculator
     m;create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
            byte - short - int - long - float -double
     */
    public static void main(String[] args) {

        double variable1 = 5.0;
        double variable2 = 7.0;
        double addition = variable1 + variable2;
        double subtraction = variable1 - variable2;
        double multiplication = variable1 * variable2;
        double division = variable1 / variable2;
        double remainder = variable1 + variable2;
        System.out.println(" Calculation of " + variable1 +" & " +  variable2 + " = ");
        System.out.println(variable1 + " + " +  variable2 + " = " + addition);
        System.out.println(variable1 + " - " +  variable2 + " = " + subtraction);
        System.out.println(variable1 + " * " +  variable2 + " = " + multiplication);
        System.out.println(variable1 + " / " +  variable2 + " = " + division);
        System.out.println(variable1 + " % " +  variable2 + " = " + remainder);


    }
}
