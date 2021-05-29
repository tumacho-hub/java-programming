package day_13_Conditional_statememnts;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        /* print"***Welcome to td bank atm***"
        secretPincodeProgram => ****
           inputPincode => ****
           if condition checks if secretPincode equals inputPincode
           true:
           "welcome to your account."
           "you can withdraw, check balance, deposit"
           false:
           "incorrect pincode ! 1234"
           "Please try again."
           Print " Thank you for using TD Bank ATM!"
           */
         /*   System.out.println("***Welcome to TD BANK ATM***");
        int secretPincode = 2233;//declare variable and assign value
        int inputPincode = 1233;
        // how we do compare** 2different ways exam
        if (secretPincode == inputPincode){
            System.out.println("Welcome to your account");
            System.out.println("you can withdraw, check balance, deposit");
        } else {
            System.out.println("inputPincode = " + inputPincode);
            System.out.println("please try again"); */
       /* System.out.println("welcome to CHASE");
        String secretPinCode = "1234;";
        String pinCode = "1234";

        /*if (secretPinCode == pinCode) {
            System.out.println("welcome to your account");
            System.out.println("you can withdraw, check balance, deposit");
        }else {
            System.out.println("incorrect pinCode! " + pinCode);
            System.out.println("please try again");
        }
        int temperture = 71;
        int temperture1 = 70;

        if (temperture1 < temperture1) {
            System.out.println("it is a beautiful day ");
            System.out.println( "lest code java ");
        }else {
            System.out.println("it is kinda cold let's chill at the crib");
            System.out.println("let's practice java");*/


    int numOne = 13;
    int numTwo = numOne++ * 2 + ++numOne + numOne++ % 4;
    int biggest = numOne > numTwo ? numOne : numTwo;
        System.out.println(numOne); //13
        System.out.println(numTwo);//14*2 14 14 %4
        System.out.println(biggest);// num2
        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2);// ab

        int g = 3, h = 7,u=4;
        long z = (g-- + h-u) * 2 / 3 % 2;
        System.out.println(z);



    }

}




