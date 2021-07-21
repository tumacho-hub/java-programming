package personal_Training_Starts_7_20_2021.stringPractice;
/*
[Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
 */
public class MoveFirstWord {
    public static void main(String[] args) {
        String word = "jorge is number one ";
        word=word.trim();
        int space = word.indexOf(" ");
        String firstWord = word.substring(0,space);
        System.out.println(word.substring(space) +  "" + firstWord);

    }

}
