package day_19_Class_vs_Object_String;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {


    /* toLowerCase() -> converts all letters to lowercase
    toUpperCase() -> convert all letters to upperCase
    String word ="Java";
    System.out.println(word.toLowerCase());
    OUTPUT : java
    ***lowerCase will ignore the value of the word and will converter it on lowerCase and the same with UpperCase! key
     */
        String word = "CyberTek";
        String sentence = "Java Is Fun";
        System.out.println(word);
        System.out.println(word.toLowerCase());// or!!
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());
        word.toLowerCase();
        System.out.println(word);

        String  wordInLcase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLcase);
        //change word to all lowercase letters, and assign to it back
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon"; // JVA METHOD -> IS A FUNCTION/ACTION/BEHAVIOUR OF THE CLASS. TO UPPERCASE IS STRING CLASS METHOD.
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);

    }
}
