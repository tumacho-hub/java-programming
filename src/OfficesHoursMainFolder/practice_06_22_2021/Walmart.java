package OfficesHoursMainFolder.practice_06_22_2021;

public class Walmart extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("View Walmart Cart");

    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Walmart");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from Walmart");

    }
}
