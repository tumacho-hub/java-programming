package day_29_NestedLoops_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        // String stars ="*";
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 0; inner <= 10; inner++) { //
                System.out.print("*");
                //  for (String i = "*"; i <= 10; i++);
            }
            System.out.println();
        }
        for (int outer = 1; outer <= 100; outer++) {
            for( int inner =1; inner <= outer; inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
