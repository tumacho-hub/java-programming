package day_58_polymorphism.amazonPractice;

public abstract class OnlineShop {
   public abstract void buy(); // methods
   public abstract void sell();
   public  void ship(){ // this method is implemented!
       System.out.println("Shipping the purchased items");
   }


}
