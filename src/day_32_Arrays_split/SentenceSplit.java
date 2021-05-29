package day_32_Arrays_split;

import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java,python,selenium,html";
        String[] sentenceArrays = sentence.split(",");
        System.out.println(Arrays.toString(sentenceArrays));
        System.out.println("length of array = " + sentenceArrays.length);
        for (String each : sentenceArrays) {
            System.out.println(each);
        }

        String word = "today I am coding java Arrays";
        String[] wordArrays = word.split(" ");
        System.out.println(Arrays.toString(wordArrays));
        System.out.println("length of array = " + wordArrays.length);
        /// this is how we printl one word from errays when we are ask!

        System.out.println("First word =" + wordArrays[0]);
        System.out.println("first word =" + sentence.split(" ")[0]);//  or (" ")[0]; cheap way to no declare [] arrays
        System.out.println("Number of words in sentence = " + wordArrays.length);

        for (String each : wordArrays){
            System.out.println(each);
        }
        System.out.println("------------ new sentence is 'java is fun ---------");
       String sentences = "java is fun ";
        String [] words = sentences.split(" ");
        System.out.println("First word  = " +words[0]);
        System.out.println("Second word = " +words[1]);
        System.out.println("Third word  = " +words[2]);

        System.out.println("---------------new task-----------");
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        System.out.println( "Number only = " + googleResult.split(" ")[1]);
        System.out.println("count = "+ googleResult.split(" ")[3].replace("(",""));
        System.out.println("count = "+ googleResult.split(" ")[3].substring(1));

    }

}


