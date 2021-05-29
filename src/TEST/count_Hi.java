package TEST;

import java.util.Scanner;

public class count_Hi {
    public static void main(String[] args) {
        /*
        Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int stringCount = 2;
        int countOfHi = 0;

        for (int i = 0; i <= str.length() - stringCount; i++) {
            String currentWord = str.substring(i,i + stringCount);

            if (currentWord.equals("hi")){
                countOfHi++;

            }

        }
        System.out.println(countOfHi);
    }
}
