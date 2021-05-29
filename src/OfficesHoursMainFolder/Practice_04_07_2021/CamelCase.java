package OfficesHoursMainFolder.Practice_04_07_2021;

public class CamelCase {
    /*
    Camel Case
    Given a string that follow Camel Case convention. Find and print how many words are in the giving string.
    Every word, expect the first word, begin with an uppercase letter. The other characters of the word will be lowercase
    EX:
    input: thisHasManyWordsToFind
    output: 6
     */
    public static void main(String[] args) {

        String  str = "thisHasManyWordsToFind";
        int word = 1; // we start at one because the first word on the string
        String temp = "";

        if (str.isEmpty()){
            word=0;
        }


        for ( int i=0; i<str.length(); i++){

            temp += str.charAt(i);

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){

            word++;

            }
        }
        System.out.println("words " + word);
    }
}
