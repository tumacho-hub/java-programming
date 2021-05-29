package day_40_ArrayList;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println("size = " + nums.size());

        /// reading form arraylist
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("Index 1 = " + nums.get(1));
        System.out.println("Index 2 = " + nums.get(2));
     //   System.out.println("index 3 = " + nums.get(3));  this will fail due to outtaBounce we haven't declare the third variable

        // print all values in the same line:

        System.out.println(nums );   // Arrays.toString(numArray)

        nums.remove(nums.get(1));
        System.out.println(nums);




    }
}
