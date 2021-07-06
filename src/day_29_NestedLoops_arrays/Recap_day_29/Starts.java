package day_29_NestedLoops_arrays.Recap_day_29;

public class Starts {
    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println(); /// this one is just adding a new line !!
        }
        for (int outer = 0; outer <= 10; outer++) {
            for (int inner = 0; inner <= outer; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int outer = 0; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
