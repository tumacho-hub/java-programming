package day_28_Loops;

public class BreakVsContinue {
    public static void main(String[] args) {
//  break statement 123
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            if (i == 3) {
                break; // 123 shows on break

        }

            }
             System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                continue; // go to next
            }
            System.out.print(i);

        }
    }
}

