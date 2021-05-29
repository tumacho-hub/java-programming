package day_36_Class_with_return_Methods;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " +Calculator.add(10,45));
        System.out.println("100 - 40 = "+ Calculator.minus(100,40));
        System.out.println("55 /4 = " + Calculator.divide(55 ,4));
        System.out.println("10 * 4 = " + Calculator.multiply(10,2));

        double d1 = 324.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1,d2);
        System.out.println("result = " + result);

    }

}
