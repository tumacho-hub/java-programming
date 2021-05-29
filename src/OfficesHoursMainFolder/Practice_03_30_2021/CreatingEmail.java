package OfficesHoursMainFolder.Practice_03_30_2021;
import java.util.Scanner;
public class CreatingEmail {
    /*
    Creating an email!
    Ask a user to enter two Strings. Both of these strings should be at least 6 character long.
    If they are shorter than that print "Invalid data" and program should end.
    If the information provided is valid, you will take the first 4 characters of the first string and combine them with
     the last three characters of the second string. At the end of your combined string add "@cybertek.com" and print
     the final string as your created email. the final email should be in all lowercase.
     input: JamesBond Secret
     output: jameret@cybertek.com

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two words no less than 6 characters");
     String word1 = input.nextLine();
        String word2 = input.nextLine();
        String email = "";

        if (word1.length() >= 6 && word2.length() >= 6){
  //       substring also work with indexes key!!
            email = word1.substring(0,4); //  we want this because we just looking for the first 4 character of the given word
           // everytime we want to get the last index of a word we use LENGTH()-1
            email += word2.substring(word2.length()-3);
            email += "@cybertek.com";
            System.out.println(email);

        }else{
            System.out.println("Invalid Data");
        }
    }
}
