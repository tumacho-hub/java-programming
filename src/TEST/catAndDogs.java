package TEST;

import java.util.Scanner;

/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

 */
public class catAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        int charCont = word.length(); // word length to measure  the length of the word
        int stringCount = 3; // this will read the word we are looking for EX: dog 3 characters!

//  we need a loop because we looking to go from first iteration to last iteration. the loop will go from beginning to end.
//
//  charcount is our first count and then we are subtracting stringcount which is our word of three characters.
        for (int i = 0; i <= charCont - stringCount; i++) {
            String currentWord = word.substring(i, i + stringCount);

            if (currentWord.equals("cat")) {
                countOfCats++;

            }else if (currentWord.equals("dog")){
                countOfDogs++;
            }

        }
        System.out.println(countOfCats==countOfDogs);
    }
}