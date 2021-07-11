package day_61_exceptions_collections.errors;

public class ErrorExamples {
    //StackOverError
    public static void main(String[] args) {

        myMethod();


    }

    static int counter = 0;

    public static void myMethod() {
        System.out.println(counter++);
        myMethod();

    }
}
