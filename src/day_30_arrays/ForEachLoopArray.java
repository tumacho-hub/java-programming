package day_30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        // everytime we have array we have indexes
        // INDEX   =  0     1  2   3     4   5    6    7   8   9    <- index so on & so for
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        for (int eachNum : data) {
            System.out.print(eachNum + " ");
        }
        System.out.println();
        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("-------------- For Loop ------------");
        /// for loop!! we can switch back and for, skip  alternate multiple times!!
        for (int i = 0; i < data.length; i++) {
            //   System.out.println(i);

            System.out.print(data[i] + " ");
        }
        System.out.println();
        // print last value in array using length-1
        System.out.print("last value; " + data[data.length - 1]);
        System.out.println();

        /// print all numbers backwards in same line
        // looping backwards ex below

        for (int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }

    }


}


