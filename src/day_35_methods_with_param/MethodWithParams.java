package day_35_methods_with_param;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(15);
        displayValue(17);

        greetByName("Maria");
        greetByName("Shante");
        String name = "Krystal";
        greetByName(name);
    }
    public static void displayValue(int num ){
        System.out.println("value is " + num );
    }
    public static void greetByName(String name){
        System.out.println("Hello " + name + " how are you today?");

    }

}
