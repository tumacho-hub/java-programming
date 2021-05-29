package day_29_NestedLoops_arrays;

public class nestedForLoop {
    public static void main(String[] args) {

        for (int minutes = 1; minutes <= 5; minutes++) {
            System.out.println("\nminutes = " + minutes);
            for (int seconds = 1; seconds <= 60; seconds++) {
                System.out.print(" " + seconds + " ");
            }
        }
        for (int minutes = 0; minutes <= 4; minutes++) {
            for (int seconds = 0; seconds <= 59; seconds++) {
                System.out.println(minutes + ":" + seconds);
            }
        }

        for (int months = 0; months <= 12; months++) {
            System.out.println(months);
            for (int days = 0; days <= 31; days++) {
                System.out.println(months + ":" + days);


                for (int r = 0; r < 2; r++) {
                    for (int k = 0; k < 3; k++) {
                        System.out.print("|Row" + r + " -Culomn" + k + "|");
                    }
                    System.out.println();
                }
            }
        }
    }
}