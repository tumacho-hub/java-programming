package day_19_Class_vs_Object_String;

import java.time.Instant;

public class LonginTest {
    public static void main(String[] args) {
        String expUserName = "Cybertek";
        String expPassword = "Abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

        if (expPassword.equalsIgnoreCase(password) && expUserName.equalsIgnoreCase(userName)) {
            System.out.println("Pass - User Successfully logged in");
        } else {
            if (expUserName.equalsIgnoreCase(userName)) {
                System.out.println("fail - username is incorrect");
            } else {
                System.out.println("Fail - Password is incorrect");
            }
        }
    }
}