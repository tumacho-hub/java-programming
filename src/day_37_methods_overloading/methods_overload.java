package day_37_methods_overloading;

import java.util.Arrays;

public class methods_overload {
    public static void main(String[] args) {
        System.out.println("Hello from real main method");
        main(10);
        System.out.println(Arrays.toString(args));
    }
    /*
    overloading main method:
    same name + different parameter
    JDK soe snot look for this one to run
     */
    public static void main(int num){
        System.out.println("num = " + num);

    }
}
