package personal_Training_Starts_7_20_2021.stringPractice;

import java.util.Locale;

/*
[Initials]
Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.
Ex:
input: james bond
output: your initials are JB
 */
public class initials {
    public static void main(String[] args) {
String name = "james bond";
int space = name.indexOf(" ");
String initials = name.substring(0,1).toUpperCase(Locale.ROOT);
String lastNameInitials = name.substring(space+1,space+2).toUpperCase(Locale.ROOT);
        System.out.println("your initials are " + initials + lastNameInitials);



    }
}
