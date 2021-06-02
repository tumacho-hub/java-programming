package day_49_static_;

public class MyBankAccount {

    static double balance = 500;
    String user;


    public void Spend(double amount){
        System.out.println( user + " is spending $" + amount);
        balance -= amount;

    }
    public void ShowBalance(){
        System.out.println("Current balance = "+ balance);
    }
}
