package day_29_NestedLoops_arrays;

public class ArraysIntro {
    public static void main(String[] args){
        int num =10; // single variable declaration

        // we declare array with three number inside array
        //                 size
       int[] nums=  new int[3]; // we have three int variables inside one variable
  // example below is declaration of array of 3 numbers that starting with the index 0 !
        nums[0] = 5;// index zero storing the value of 5 and so on and so on!
        nums[1] = 7;
        nums[2] = 10;
       // 5, 7, 10
        System.out.println(nums[0] );
        System.out.println( nums[1] );
        System.out.println( nums[2]);
        System.out.println(nums[0] + nums[1] + nums[2]);
        // we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);//value of index 0=5
        i++;
        System.out.println(nums[i]);

        System.out.println("-----------------------------------------");
        /// how to find out the size of the array?.
      System.out.println("number of elements = " + nums.length);
        // store length of array into len variable
      int len = nums.length; // store length of array into len variable
        System.out.println("len = " + len);
        //  yes can we reassign values on array by changing the indexes values!!
       nums[0] = 100;
       nums[1] = 300;
        /// read the value of index 1 and assign same to index 3 EX:
        nums[2] = nums[1];
        System.out.println("---------------------------------------");
       System.out.println("nums[0] = " +nums[0]);
       System.out.println("nums[1] = " +nums[1]);
       System.out.println("nums[2] = " +nums[2]);


    }
}
