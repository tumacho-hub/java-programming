package day_11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        // 10 > 5 ? --> true / "yes"
        // 5 > 50? ---> false / "no"
        // 432 = 432 ---> TRUE --> YES THEY ARE EQUAL
        //BOOLEAN/COMPARISON OPERATORS:
        // =,= -> equals (checks if 2 values are equal)
        // a==b
        // > --> greater than ( checks if first value is greater than second)
        // a > b
        // < --> less than ( checks if first value is less than second one)
        // a < b
        // >= --> greater than or equals to (checks if first value is greater)
        // a >=b
        // <= --> less than or equals( checks if first value is greater than or equal to second)
        // a <= b
        // != --> is not equal ( checks if first value is NOT equal to the second)

        System.out.println(10==10);
        System.out.println(20 > 5);
        System.out.println(4 < 9);
        System.out.println(25 >= 24);
        System.out.println(52 <= 34);
        System.out.println(12 != 76);

        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        //declare variable next
        boolean result;
        result = 5 ==5;
        System.out.println("result = " + result);
        // no int because we are generating BOOLEAN!
        result = 33 > 44;
        System.out.println("result = " + result);
        result = 88 < 99;
        System.out.println("result = " + result);
        result = 10 >= 10;
        System.out.println("result = " + result);
        result = 123 <= 1234;
        System.out.println("result = " + result);
        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "chicago";
        System.out.println(city == "chicago");
        System.out.println(city == "baku");
        System.out.println(city != "Fairfax");

        String name = "Nadir";
        boolean checkname = name == "Nadir";
        System.out.println("checkName = " + checkname);
        checkname = name != "kuzzat";
        // so the result of all comparisonOperators is always boolean thats why
        //we can assign value to boolean variables:
        //  int n1 = 5;
        // int n2 = 3;
        //System.out.println(n1 == n2); //false or true?
        // boolean check = n1 == n2;
        //system.out.println(check);
        // boolean check2 = n1 > n2;
        //System.out.println(check2); true
        // boolean hungry = n1 != n2
        //System.out.println(hungry); true

        // 2 - 3
        // int age = 2;
        //boolean noMoreToddler = age > 3
        //System.out.println(noMoreToddler); --> false

        // age = 66
        //boolean seniorCitizen = age >= 65;
        //System.out.println("is senior citizen? - " + seniorCitizen);
        //
        //SUMMARY:
        // --> POST, VE PRE INCREMENT/DECREMENT
        // --> BOOLEAN OPERATORS

























        
        
        
        
        
        
        
        
        
        
        















    }
}
