package day_38_Methods;

public class ArraysUtilTest {
    public static void main(String[] args) {
        int [] nums= {5,23,1,543,90};
        ArraysUtils.PrintArrays(nums);
        ArraysUtils.PrintArrays(new int[]{23,64,23,534,234,45,234,45});
        System.out.println("---------------------------------------------------");
        System.out.println("Sum = "+ ArraysUtils.sum(nums));
        System.out.println("Sum = " + ArraysUtils.sum(new int[]{23,64,23,534,234,45,234,45}));
        System.out.println("---------------------------------------------------------");
       int[] num1 = {4,1,5,8,10};
        System.out.println(" 5 - found = " + ArraysUtils.contains(num1,8));
        System.out.println("20- found = " + ArraysUtils.contains(num1,20));

    }

}
