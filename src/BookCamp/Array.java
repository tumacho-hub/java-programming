package BookCamp;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
     /*
        // this is how do we declare arrays
       //What's array? --> array is a collection of data of the same type and it a fixed sized!!
        // what does jdk jre jvm is ?
          JDK stand for JAVA DEVELOPMENT KID
          JRE stands for JAVA RUNTIME ENVIRONMENT
          JVM stands for JAVA VIRTUAL MACHINE.
      */


        String[] names = {"jorge", "zizu", "Aliham", "tolga", "0"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[][] num = {{3, 4}, {2, 4, 6, 8}};
        System.out.println(num[1][2]);

        int[][] numbers = new int[2][3];
        numbers[1][2] = 10;
        System.out.println(Arrays.toString(numbers));
        //    System.out.println(numbers[3][5]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        //	at BookCamp.Array.main(Array.java:21)
        // lets


    }
}
