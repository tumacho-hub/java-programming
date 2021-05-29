package OfficesHoursMainFolder.Practice_05_12_2021;

public class Bank {
    public static void main(String[] args) {
// no main objects here so far
///   reference         //      constructor
        BankAccount BankOne = new BankAccount(); // this is declaration of object

    BankOne.accountHolderName = "James Bond";
    BankOne.pin = 1234;
    BankOne.balance = 1_000_000;
    BankOne.accountNumber = 21332131;

        System.out.println(BankOne.pin);
        System.out.println(BankOne.getBalance(1234));
        System.out.println("---------------------------");

        System.out.println(new BankAccount().accountHolderName);

        BankOne = new BankAccount(); // new object without a name

        System.out.println(BankOne.accountHolderName);



    }
}
