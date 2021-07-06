package day_29_NestedLoops_arrays.Recap_day_29;

import javax.swing.*;

public class nestedLoops {
    public static void main(String[] args) {
/*
nested loops are useful when we need to make alterations to our outer loop. In this case we use an inner loop so the
outer loop works on every alteration in the inner loop.
 */
        for (int minutes = 0; minutes <= 5; minutes++) {
            System.out.println("Minutes = " + minutes);

            for (int seconds = 0; seconds <= 59; seconds++) {
                System.out.print(seconds + " ");
            }
            System.out.println();

//            for (int miles = 2000; miles >= 0; miles--) {
//                System.out.print(miles);

        }
        for (int miles = 2000; miles >= 0; miles--) {
                System.out.println(miles);

        }
        for (int starts = 0; starts<=5; starts++){
            System.out.println(starts);
            for (int prints = 0; prints<=10; prints++){
                System.out.println(prints);
            }
        }

    }
}
