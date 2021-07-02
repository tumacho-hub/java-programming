package replitTasks;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageFrom1To3 = input.nextInt();
        int calculation = ageFrom1To3 + 2;
        int fourYears = ageFrom1To3 + 1;

        if (ageFrom1To3 <= 3) {
            System.out.println(ageFrom1To3);

        } else if (ageFrom1To3 > 4 && ageFrom1To3 <= 10) {
            System.out.println(calculation);

        } else if (ageFrom1To3 == 4){
            System.out.println(fourYears);
        }
    }
}

