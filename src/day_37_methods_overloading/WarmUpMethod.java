package day_37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekstudent", "abc123"); // POSITIVE TEST or more known as  "SUNNY DAY"
        loginVoid("i forgot the password","abc123");// NEGATIVE TEST or known as "RAINY DAY"

        System.out.println(login("cybertekstudent", "abc123"));
        if (login("cybertekstudent", "abc123")){
            System.out.println("log in successful, welcome student");
        }else{
            System.out.println("login access denied!");
        }
         boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("IsLogInSuccess = " +isLoginSuccess);

        if (login("nadir", "mountain")){
            System.out.println("Welcome to canvas, select course or calendar");
        }else {
            System.out.println("Something wrong with your credentials");
        }
    }
    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if (secretUserName.equalsIgnoreCase(userName) && secretPassword.equals(password)) {
            System.out.println("Login Successful, Welcome to Cybertek Student :) ");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

         public static boolean login(String userName, String password ){
            String secretUserName = "cybertekStudent";
            String  secretPassword = "abc123";
            /// we can declare two ways for the returns the below example is one of the standards way with
             // IF STRATEMENTS like example shown below!
            if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
                return true;
            }else{
                return false ;
                // second and short cut way, is below example
             //   return (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword);

                }

            }
        }


