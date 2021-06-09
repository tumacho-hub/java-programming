package replitTasks;

import java.util.Scanner;

public class PrintTriangle {
    /*
    Write a program that will create a triangle of asterisks based on size n.
    this case we need a nested loop
     */
    public static void main(String[] args) {
   //     int i = 1;
   //     int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
