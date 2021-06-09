package replitTasks;

import java.util.Scanner;

public class printVowels {
    //Create a program that will take the given String In and print out all the vowels from the String.
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        for (int i = 0; i < word.length(); i++ ){
            char current = word.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u'){
                System.out.println(current);
            }

        }
    }

}
