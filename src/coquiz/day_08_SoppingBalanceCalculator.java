package coquiz;

public class day_08_SoppingBalanceCalculator {
    public static void main(String[] args){
        double balance = 345.55;

        double price1 = 20.88;
        double price2 = 89.99;
        double price3 =15;

        double remainingBalance = balance- price1-price2-price3;
        int balanceWithNoCents = (int)remainingBalance;
        System.out.println("i like\"java\"program");

        System.out.println(balanceWithNoCents);
    }
}
