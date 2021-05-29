package day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MethodsWithListReturn {

    /*
    getIntegertList
    return List<Integer>
    Loop from 0 -1000_000
    and add to arraylist then return it
    example of how to return it the method
     */


    public static void main(String[] args) {
        System.nanoTime();// 1 second  = 1_000_000_000 of a second
        long start = System.nanoTime();
        System.out.println(System.nanoTime());
        //when method is returning we dont new to do a new declaration we usually use new to created  a new object
        //    List<Integer> nums = new ArrayList<>()
        List<Integer> oneMillion = getIntegerList();
        long end = System.nanoTime();
        double listSeconds = (end - start) / 1_000_000_000.0;

        System.out.println("ArraysList time = " + (end - start));
        System.out.println("Array time seconds = " + listSeconds);

        long st = System.nanoTime();
        int[] arr = getIntegerArray(); // this is the declaration of array
        long en = System.nanoTime();
        double seconds = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time seconds = " + seconds);


        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90); // removes number less than the 90
        System.out.println("nums = " + nums);
        //   System.out.println(oneMillion);

    }

    public static List<Integer> getIntegerList() { // declaration of method
        List<Integer> nums = new ArrayList<>(); //
        for (int i = 1; i <= 1_000_000; i++) {
            nums.add(i);
        }

        return nums;


    }

    /*
    getInteger Array
    no  params
    return int[]
    loop from 0 -1000
     */
    public static int[] getIntegerArray() {
        // declare empty array with size 1_000_001
        int[] nums = new int[1_000_001];
        for (int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;
        }
        return nums;
    }
     /*
    method  getDays
      */

/*
get RandomList
param: int size
return list<Integer>
generate random number(0-100) the count of size, and assign to list then return
getRandomList(3) -> 43,12,54
getRandomList(2) -> 1,4,
 */

    public static List<Integer> getRandomList(int size) { // beginning part the way we call it
        Random ramdom = new Random();// new random object to generate object
        List<Integer> nums = new ArrayList<>();
        //  for (int i = 0; i < size; i++){
        int n = ramdom.nextInt(101);
        if (!nums.contains(n)) {
            nums.add(n);

            nums.add(ramdom.nextInt(101)); //
        }


        return nums;
    }

}






