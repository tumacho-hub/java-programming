package day_40_ArrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();  // Polymorphic way of declaring

        System.out.println("size = " + nums.size());

        nums.add(10);
        nums.add(12);
        nums.add(55);
        nums.add(32);
        nums.add(5);
        nums.add(88);
        nums.add(5);
        nums.add(556);
        nums.add(63);
        nums.add(78);
        nums.add(108);
        nums.add(98);
        nums.add(5);

        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println("nums = " + nums);

        /// in order to remove a specific number we need to use wrapper!! Ex;
// in order to get rid of the number 88  we need a  wrapper otherwise java thinks we looking for index 88
// nums.remove(88); index->88 -> IndexOutOfBoundsException
        nums.remove(new Integer(88));
        System.out.println("nums = " + nums);

        nums.remove(new Integer(5));
        System.out.println("sum = " + nums);


        /// for loop - iterate through all the values and print
        //// example of FOR LOOP for Arraylist!

        for (int i = 0; i < nums.size(); i++) {
            System.out.println( nums.get(i));
        }
        // example of EACH LOOP for ARRAYLIST
        for (Integer each : nums) {
            System.out.print(each + " ");
        }
    }
}