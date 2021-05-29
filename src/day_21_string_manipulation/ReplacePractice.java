package day_21_string_manipulation;

import javax.lang.model.SourceVersion;

public class ReplacePractice {
    public static void main(String[] args) {

        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);
        
        word = word.replace("hub","lab");
        System.out.println("word = " + word);

        System.out.println(word.replace('i','o').replace('a','i')); /// how to replace letter or characters on string

        String  sentence = "java is fun";
        String withNoSpaces;
        System.out.println(sentence.toUpperCase().replace(" ",""));

        sentence = sentence.replace("java", "selenium").replace("fun","a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4000 results for \"java book\"";
        result = result.replace("1-48 of over","")
                                 .replace("results for \"java book\"" , "");
        System.out.println("result = " + result);

    }
}
