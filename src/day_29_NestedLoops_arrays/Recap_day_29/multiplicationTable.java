package day_29_NestedLoops_arrays.Recap_day_29;

public class multiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){
            for (int inner = 1; inner <= 10; inner++){
                System.out.print((i * inner) + "\t");
            }
            System.out.println();
        }

        for (int row = 1; row <= 3; row++){
            for (int col = 1; col<= 4; col++){
                System.out.println(row + " | " + col );
            }
            System.out.println();
        }
    }
}
