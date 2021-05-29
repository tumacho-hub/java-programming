package day_31_Arrays;
import java.util.*;
import java.util.Collection;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] numbs = {5, 9, 4, 6, 2, 1, -4};
        System.out.println(Arrays.toString(numbs));

        System.out.println(numbs);

        Arrays.sort(numbs);
        System.out.println(Arrays.toString(numbs));

        System.out.println("min value: " + numbs[0] );
        System.out.println("max value : " + numbs[numbs.length-1]);

        String[] words ={"java", "C#","C++", "kotlin","python", "ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ", words));

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort words in reverse order

        Arrays.sort(words, Collections.reverseOrder());
        int [] nums = {33, 55, 123, 400};
        Arrays.binarySearch(nums, 55);
        System.out.println();
        Arrays.binarySearch(nums, 400);
        Arrays.binarySearch(nums, 40);
        Arrays.binarySearch(nums, 33);


    }
}
