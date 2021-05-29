package TEST;
import java.util.*;
public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int wordJava = 4;
        int wordPython = 5;

        int countOfJava = 0;
        int countOfPython = 0;

        for (int p = 0; p <= word.length()- wordPython; p++){
            String currentWord2 = word.substring(p,p + wordPython);
            if (currentWord2.equals("python")){
                countOfPython++;

            }

                }
        System.out.println(countOfPython);
            }


        }

      //  System.out.println(countOfJava == countOfPython);
//
//        for (int i = 0; i <= word.length() - wordJava; i++) {
//            String currentWord = word.substring(i, i + wordJava);
//            if (currentWord.equals("java")) {
//                countOfJava++;
