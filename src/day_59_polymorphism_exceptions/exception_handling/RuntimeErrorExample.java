package day_59_polymorphism_exceptions.exception_handling;
/*
* Run time Exception happens in below code, code compiles fine and  during fine and running
 */
public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0);
        System.out.println(10/3);

        int[] nums = {4,6,10};
        System.out.println(nums[0]);
        System.out.println(nums [3]);//ArrayIndexOutOfBoxException 3
    }
}
