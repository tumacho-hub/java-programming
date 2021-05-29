package OfficesHoursMainFolder.Practice_05_17_2021.Prcatice_05_18_2021;

import java.util.Arrays;
import java.util.Locale;

public class mutability {
    public static void main(String[] args) {
        String one = "java";
        String two = one;
        String three = two.toUpperCase();
        System.out.println(three);
        System.out.println( two == three);

        one = one.substring(2);
        System.out.println(one);
        System.out.println(two);

        String a = new String("anything");
        String b = a;
        b = b.toUpperCase();
        System.out.println("a " + a);
        System.out.println("b " + a);

        int[]arr ={1,2,3};
        int[]arr2 = arr;
        arr [0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
