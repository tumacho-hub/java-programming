package day_58_polymorphism.amazonPractice;

public class Amazon extends OnlineShop implements Prime {
    // ship is not generated because is not abstract
    @Override
    public void buy() {
        System.out.println("Buying items from Amazon");
    }

    @Override
    public void sell() {
        System.out.println("Selling items from Amazon.com");
    }

    @Override
    public void PrimeShipping() {
        System.out.println("Free-2day shipping for prime users");
    }
}
