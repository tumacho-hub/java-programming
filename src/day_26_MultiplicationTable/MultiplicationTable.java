package day_26_MultiplicationTable;

public class MultiplicationTable {
    public static void main(String[] args) {
        /* tip if confuse start whitt the basic code  to get the basic idea..
        int number = 5;
        System.out.println( number + " X " + 1 + " = "+ (number*1));
        now lets refactor the code
         */
        int num = 15;
        if (num < 1 || num > 10) {
            System.out.println("ERROR: invalid input");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        }

    }


