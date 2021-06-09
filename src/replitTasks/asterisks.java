package replitTasks;

import java.util.Scanner;

public class asterisks {
    public static void main(String[] args) {
  //Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        String myStars = "";

        for (int i = 1; i <= n; i++) {
            myStars+= "*";

        }
        System.out.println(myStars);
    }
}
