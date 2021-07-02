package replitTasks;

import java.util.Scanner;

/*
Given two strings, word and a separator sep,
return a big string made of count occurrences of the word,
separated by the separator string.
 */
//count is everything together! word+separator that's the reason we need to subtract one !

public class Repeat_separator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();// word is one time
        String separator = scan.next(); // separator one time
        int count = scan.nextInt(); // count is word+separator together

        String result = "";
/*
        word, X , 3
        word+X word+X + word
        in the loop below this is the reason why we add count-1 because is one concatenation together will subtract one
        complete word while executing the loop.
        we added the variable result to store our count after the alteration from the loop
 */

        for (int i = 1; i <= count-1; i++){
            result+= word+separator;
        }
        result += word;
        System.out.println(result);
    }
}