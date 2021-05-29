package day_08_casting_scanner;

public class SoppingBalanceCalculator {
    public static void main(String[] args){

        //balance ->345.55
        //price1 -> 20.88
        //price2 -> 89.99
        //price3 -> 15

        // remainingBalance ->
        // your initial balance: $345.55
        // your remaining balance:$199.13
        // we use double for balance, double for prices as well for the decimal
        //

        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double remainingBalance = balance - price1 - price2 - price3;
        //double remainingBalance = balance - price1 - price2 - price3;
        System.out.println("Your initial balance: $" + balance);
        System.out.println("your remain balance: " + remainingBalance);

          int balanceWithNoChane = (int)remainingBalance;
        System.out.println("Remaining balance with out cents $ " + balanceWithNoChane);







    }
}
