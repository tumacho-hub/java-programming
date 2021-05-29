package test1;

public class test {
    public static void main(String[] args) {

        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 =  15;

        double remainBalance = balance - (price1+price2+price3);// 219.68 left at your bank


        System.out.println("Your Initial balance: $" + balance);// 345

        System.out.println("your remaining balance:$" + ( remainBalance));//  had in the bank 345-   what is left on the bank 219




        int balanceNoCents = (int)balance;
        int remainBalance2 = (int)remainBalance;
        System.out.println("Your reminder balance without no cents: " + remainBalance2 );





    }
}
