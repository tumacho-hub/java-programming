package day_36_Class_with_return_Methods;

import java.util.Random;

public class Info {
    public static void main(String[] args) {

        fullName();
        System.out.println("Full Name: " + fullName());

        isMarried();
        System.out.println("Is married? "+ isMarried());

        getAge();
        System.out.println("How old are you? "+ getAge());


        System.out.println("Birth year = "+ getRandomYear());

      //  we are resigning  our methods into a variable
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int randomYear = getRandomYear();

    }
    public static String  fullName (){
        return "jorge Flores";
    }
    public static boolean isMarried(){

        return false;
    }
    public static int getAge(){
        int age = 35;
        return age;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(35);
        return randomYear;

    }
}
