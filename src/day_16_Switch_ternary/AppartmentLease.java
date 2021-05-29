package day_16_Switch_ternary;

public class AppartmentLease {
    public static void main(String[] args) {
        System.out.println("welcome to apartmets **EL COCHO**");
        int bedrooms = 10;
        double Starting$ = 0;
        switch(bedrooms) {
            case 0:
                System.out.println("Studio appartment selected");
                Starting$ = 1454;
                break;
            case 1:
                System.out.println("one bedroom apartment selected");
                Starting$ = 1725.0;
                break;
            case 2:
                System.out.println("two bedrom apartment selected");
                Starting$ = 2899;
                break;
            default:
                System.out.println(bedrooms + "bedroom currently unavailable");
                break;


            }
        System.out.println("starting price: $" +Starting$);








                }
    }

