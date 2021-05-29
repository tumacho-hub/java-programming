package day_07_arithmetic_operators_casting;

public class castingExamples {
    public static void main(String[] args){

        char letter = 'J';
        int numLetter = letter;
    System.out.println(numLetter);

     // note : every char also has number associated to it.
        // 'a' -> 97
        //so if you assign char into int. that number will be assigned.

        // summary: casting primitives. we can cast primitives from one to another.
        //from smaller to larger -> automatic casting/conversion
        //from larger to smaller -> explicit/manual casting, we need to use()
        //byte - short - int - long - float - double
        //char -> can cast to int
        //boolean -> no casting

        double d = 10.5;
        short sh = (short)d;
        System.out.println(sh);

        // if you cast/convert from decimal number to whole number, it will remove
        // decimal point and value.
        int num = (int)123.4;
        System.out.println(num);

double d1 =12;
double d2 =5;
        System.out.println(d1/d2);





                //when we cast, whole number into double, it will add .0 to decimal
                //make it decimal.



    }
}
