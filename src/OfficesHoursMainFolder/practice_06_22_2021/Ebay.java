package OfficesHoursMainFolder.practice_06_22_2021;
/*
Create a concrete class Ebay
    - Inherit OnlineShopping and implement all abstract methods
*/
public class Ebay extends OnlineShopping implements AllowUsersToSell{

    @Override
    public void viewCart() {
        System.out.println("Viewing ebay cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from ebay ");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning to ebay");

    }

    @Override
    public void uploadProduct() {
        System.out.println("Ebay Seller");
    }
}
