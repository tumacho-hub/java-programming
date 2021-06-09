package replitTasks;

import java.util.Scanner;

public class trueOrFalse {
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is
equal to the number of appearances of "python" anywhere in the string (case sensitive).
 */
public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int charCount = sentence. length();
        int javaCNT = 0, pythonCNt = 0;
        int tCharCount = 4; // java

    for (int i = 0; i <= charCount-tCharCount; i++) {
        if (sentence.substring(i, i + tCharCount).equals("java")) {
            javaCNT++;
        }
    }
    tCharCount = 6; // python
    for (int i = 0; i <= charCount-tCharCount; i++) {
        if (sentence.substring(i,i+tCharCount).equals("python")){
            pythonCNt++;
        }


    }
    System.out.println(javaCNT == pythonCNt);
}
}

