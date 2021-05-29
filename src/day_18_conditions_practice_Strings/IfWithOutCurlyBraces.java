package day_18_conditions_practice_Strings;

public class IfWithOutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";
        if (todaysClass.equals("Java"))
            System.out.println("java is fun");


        else
            System.out.println("it is not java. it is " + todaysClass);
        int a = 4;
        if (a == 4) {
            System.out.println("a is 1");
            System.out.println("1 is a");
        }

    }
}
