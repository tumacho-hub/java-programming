package day_18_conditions_practice_Strings;

public class AuthenticationTest {
    public static void main(String[] args) {
        int last4SSN = 1222;
        int pinCode = 0001;
        int expLast4SSN =1222;
        int expPinCode = 0000;
        if (last4SSN == expLast4SSN && expPinCode== pinCode) {
            System.out.println("Authentication is Successful");

        }else if (expLast4SSN != last4SSN) {
            System.out.println("Last 4 of SSN did not match");
        }else if (expPinCode != pinCode) {
            System.out.println("pincode does not match");
        }else{
            System.out.println("Error!!");
        }

    }
}
