package TEST;

import java.util.Scanner;

public class CountJava {
    /*
    Print the number of times that the string "java" appears anywhere in the given string word
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int stringCount = 4;
        int countOfJava = 0;

        for (int i = 0; i <= str.length() - stringCount; i++) {
            String currentWord = str.substring(i,i + stringCount);

            if (currentWord.equals("java")){
                countOfJava++;

            }

        }
        System.out.println(countOfJava);
    }
    }


