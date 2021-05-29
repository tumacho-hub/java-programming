package day_46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(123456789);
        acc.setBalance(250.20);
        acc.setAccountHolder("Jorge Flores");
        acc.setType("360 checking");

        System.out.println("acc = " + acc);


    }


    }

