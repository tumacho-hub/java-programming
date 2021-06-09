package replitTasks;

public class evenFrom80_20 {
    /*
    Write a for loop that prints all even integers from 80 through and including 20. Seperate each number with a space
     */
    public static void main(String[] args) {

        for (int i = 80; i >= 20 ; i--) {
            if (i % 2 ==0 ){
                System.out.print(i + " ");
            }


        }


    }
}
