package personal_Training_Starts_7_20_2021;

import java.util.Scanner;

public class Calculator_Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one:");
        double numberOne = input.nextDouble();
        System.out.println("Enter the operator:");
        String operator = input.next();
        System.out.println("Enter number two:");
        double numberTwo = input.nextDouble();
        double result = 0;
        boolean valid = true;

        switch (operator){
            case "plus": case "add": case "+": case "addition":
                result = numberOne + numberTwo;
                break;
                case "minus": case "subtract": case "-": case "subtraction":
                    result = numberOne -numberTwo;
                    break;
                    case "multiply": case "*": case "x": case "X": case "multiplication":
                        result = numberOne * numberTwo;
                        break;
                        case "divide": case "division": case "/":
                            if(numberTwo == 0) {
                                System.out.println("Dividing by 0 is not valid");
                                valid = false;
                                break;
                            }result = numberOne / numberTwo;
                            break;
                            case "remainder": case "%": case "remaining":
                                result = numberOne % numberTwo;
                                break;
                                default:
                                    System.out.println("Invalid operator given");
                                    valid = false;
        }if(valid) {System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + result);}
    }
}
