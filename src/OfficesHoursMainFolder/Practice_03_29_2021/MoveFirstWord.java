package OfficesHoursMainFolder.Practice_03_29_2021;

public class MoveFirstWord {
    /*
    [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
     */
    public static void main(String[] args) {

        String  str = "Java is a fun language";

// charAt: reads the number and gets me the character at that position therefore we need to use indexOf to resolve this task
// indexOf : take the position and get the value number

 // tip if we he space before the word we can trim it EX:
                 // str.trim().indexOf() will  work  but we will have add str.trim to the entire code
        // instead we can use one variable to get the extra spaces out

        int space =  str.indexOf(" "); // index will find the first space character
        str.trim(); //  it will not be permanently because is not a variable!!
        String firstWord = str.substring(0,space);

        System.out.println(firstWord);

        System.out.println(str.substring(space + 1)); //  we adding the one because we need to get rid off the space
 // or we can use trim to trim it !

 //  To finish the task we just need to concatenate our printing!

        System.out.println(str.substring(space + 1) + " " + firstWord);
    }
}
