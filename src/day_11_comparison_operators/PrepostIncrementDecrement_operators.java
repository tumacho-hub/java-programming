package day_11_comparison_operators;

public class PrepostIncrementDecrement_operators {
    public static void main(String[] args) {
        //PRE-INCREMENT ++(increase by 1)
        int num1 = 10;
        //++num1;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //increase by one and then assign!!

        //POST-INCREMENT
        int num3 = 8;
      //  int num4 = num3;
      //  num3++; //increase by one"add 1" make this two lines in one
        int num4 = num3++;// number 8 will be add it to the num4 automatically add 1 to the same variable
        System.out.println("number3 = " + num3);//9
        System.out.println("number4 = " + num4);//4

        //PRE-INCREMENT EXAM;
        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);
//POST-INCREMENT EXAM:
        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwibasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);// = 5 but ++ will add 1 total = 6
        int sedans = 10;
        System.out.println(sedans++);//it will not increase right away until the second attemp
        System.out.println(sedans);

        int myNumber = 99;
        int yourNumber = myNumber++;
        System.out.println(myNumber);
        System.out.println(yourNumber);

        int a = 50;//50
        int b = 22;//22
        int c = a++ + ++b;
               //50 // 23
        // a = ? 51
        // b = ? 23
        // c = ? 73
              //
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

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
        // !+ --> is not equal ( checks if first value is NOT equal to the second)













    }
}
