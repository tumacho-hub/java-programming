package coquiz;

public class day_07_StirngConcatPractice {
    public static void main (String[] args){
        //we want java 8 it wont work because java works from left to right!
        System.out.println("java " + 5 + 3 ); // java53
        // we want java  to add the number so we need two parenthesis
        System.out.println("java" + (5 + 3)); // java8
        // we have another exam on how to add
        System.out.println(5 + 3 + "java");// 8java
        System.out.println( 5 + (3 + "java"));//53java parenthesis is always first
        System.out.println("Hello" + 1+2+3); // hello123
        System.out.println("hello" + (1+2+3)); // hello6
        /// to add math calculation we need to use parenthesis (), value in () will
        // be evaluated?calculated first.
        /// Empty String-> is a string with no
        String str1 =  "hello";
        String str2 = "friends";
        // hello friends
        System.out.println( str1 + str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2 );
        System.out.println(num1 +  " " +  num2);//
        System.out.println(num1 +"" + num2);

    }
}
