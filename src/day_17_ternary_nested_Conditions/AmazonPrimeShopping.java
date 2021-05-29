package day_17_ternary_nested_Conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 25.99;
        boolean isPrimeMember = false;
        if (isPrimeMember){
            System.out.println("free 2 day shipping eligible");

        }else {
            if (itemPrice >= 25.0){
                System.out.println("eligible for free shipping");
            }else{
                System.out.println("not eligible for free shipping. Fee = $10");
            }
        }


    }
}
