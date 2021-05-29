package day_37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading.sum(10,5);
        sum(10.5,12.5);
        sum(10, 25.5);
        sum(4,12,5);
        sum((int)4.2,5,12);
        sum("hello ", "world");
    }

    public static void sum(int a, int b) {
        System.out.println("sum(int a, int b");
        System.out.println("Result = " + (a + b));
    }

    public static void sum(int a, int b, int c) {
        System.out.println("sum(int a, int b, int c");
        System.out.println("Result = " + (a + b+ c));
    }
    public static void sum (double a, double b){
        System.out.println("sum(double,double)");
        System.out.println("result = " + (a+b));

    }
    public static void sum(String a, String b){
        System.out.println( "sum(string, string)");
        System.out.println("result = " + (a+b));
        // signature is the method and parameters together!!
    }
}

