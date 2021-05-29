package day_10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {

        double balance = 1200.44;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        // decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance );

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance after kenafa = " + balance);
        /// second kenafa is 50% off. lets buy it.
        kenafa = kenafa / 2;
        System.out.println("kenafa = " + kenafa);
        // buy it and decrease balance with kenafa price

        balance = balance - kenafa;
        System.out.println("Balance after discount = " + balance);

        double play = 7.99;
        System.out.println("play = " + play);
        balance = balance - play;
        System.out.println("balance after play = " + balance);

        double iceTea = 3.0;
        System.out.println("icedTea = "+ iceTea);
        /// buy 4 iced teas and decrease balance
        balance = balance - iceTea * 4;
        System.out.println("balance after 4 iced teas = $ " + balance);

        // return baklava
        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning the baklava =  $" + balance);




    }
}
