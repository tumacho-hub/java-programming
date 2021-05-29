package OfficesHoursMainFolder.Practice_05_12_2021;

public class BankAccount {
    // variables that belong to the BankAccount Class!! is all have we have so far
    String accountHolderName;
    // we dont want to give any value because we need to use the default value of the variable
    double balance;
    long accountNumber;
    int pin;

    public double getBalance(int inputPin){
        if( pin == inputPin){
            return  balance;

        }
        return -1;
    }

    }

