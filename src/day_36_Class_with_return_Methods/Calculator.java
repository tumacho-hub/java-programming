package day_36_Class_with_return_Methods;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5, 9));
        double result =add(5,5);
        System.out.println("result = " + result);

        System.out.println(minus(7,3));
        double minusResult = minus( 10,13);
        System.out.println("minusResult = " + minusResult);

        System.out.println(multiply(3,3));
        double resultMultiplication = multiply( 5,5);
        System.out.println("resultMultiplication = " + resultMultiplication);

        System.out.println(divide(30,10));
        double resultDivision = divide( 10,10);
        System.out.println("resultDivision = " + resultDivision);

    }
    public static double add(double num1, double num2){
        double sum = num1+num2;
        return sum;
    }
    public static double minus(double minus1, double minus2 ){
        double subtraction = minus1 - minus2;
                return subtraction;
    }
    public static double multiply(double num1, double  num2){
        double multiplication = num1 * num2;
        return multiplication;
    }
    public static double divide(double num1, double num2) {
         double result = num1/num2;
         return  result;
    }
}
