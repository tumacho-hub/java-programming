package personal_Training_Starts_7_20_2021.stringPractice;

import java.util.Scanner;

/*
[Creating an email]
Ask user to enter two strings. Both of these strings should be at least 6 character long. If they
are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and
combine them with the last three characters of the second string. At the end of your combined
string add “@cybertek.com” and print the final string as your created email. The final email
should be in all lowercase.
input:
JamesBond
Secret
output:
jameret@cybertek.com
 */
public class Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two names");
        String name = input.nextLine();
        String name2 = input.nextLine();
        String email = "";
        if (name.length() >= 6 && name2.length() >= 6 ){
        email = name.substring(0,4);
        email += name2.substring(name2.length()-3);
        email += "@cybertek.com";
            System.out.println(email);

        }else{
            System.out.println("Invalid data");
        }








    }
}
