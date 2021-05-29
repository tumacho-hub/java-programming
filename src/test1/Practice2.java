package test1;

import day_21_string_manipulation.charAt;

import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int charCount = word.length();
        int middleIndex = charCount / 2;
//hihi uuuu
        if (charCount == 1  ) {
            System.out.println("" + word + word + word);
        } else if (charCount == 2) {
            System.out.println("" + word + word + word + word);
        } else if (charCount >= 3) {
            if (charCount % 2 == 1) {
                System.out.println(word.charAt(middleIndex));
            } else {
                System.out.println(word.charAt(middleIndex -1) + "" + word.charAt(middleIndex ));
            }

        }
    }
}


