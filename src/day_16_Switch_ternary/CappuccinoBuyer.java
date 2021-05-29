package day_16_Switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
         String size = "tall";
         double price =0;
         int calories =0;
         switch (size) {
             case "tall":

                 System.out.println("tall cappucino please");
                 price = 2.69;
                 calories = 90;
                 break;
             case "grande":
                 System.out.println("grande cappuccino please");
                 price =3.99;
                 calories = 120;
                 break;
             case "venti":
                 System.out.println("venti cappuccino plz");
                 price = 4.29;
                 calories = 150;
                 break;
             default:
                 System.out.println("we dont serve " + size + " cappuccino");
                 break;


                 }
        System.out.println("Total price : $ " + price );
        System.out.println("total calories: " + calories);
         }
    }

