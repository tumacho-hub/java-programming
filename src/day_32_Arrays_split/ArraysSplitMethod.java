package day_32_Arrays_split;

import java.util.Arrays;

public class ArraysSplitMethod {
    public static void main(String[] args) {
        String  words = "bengal cat tabby cat persian cat";
        String[] wordsArray = words.split("cat");

        System.out.println(Arrays.toString(wordsArray));
        System.out.println( "Length of Array = " +wordsArray.length);

        for (String each : wordsArray) {
            System.out.println(each);
        }
        String sentence = "today im learning java with arrays";
        String[] wordsInSentence =  sentence.split(" ");
        System.out.println("first word: " + wordsInSentence[0]);
        System.out.println("first word: " + sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = " + wordsInSentence.length);

      //  System.out.println(Arrays.toString(wordArrays));
      for (String each : wordsInSentence){
            System.out.println(each);
        }
    }

}
