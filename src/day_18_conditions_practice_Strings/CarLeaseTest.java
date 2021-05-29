package day_18_conditions_practice_Strings;

public class CarLeaseTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "A";
        double leasePrice = 0.0;


        if (make.equals("Mercedes") && model.equals("E")){
            leasePrice = 500.0;
        }else if (make.equals("Mercedes")&& model.equals("A")) {
            leasePrice = 400.0;

            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("LeasePrice = " + leasePrice);
        }
        }
       /* String model2 = "A";
        String leasePrice2A ="$ 400";
        String make2 = "Audi";
        String modelA = "SQ5";
        String leasPriceA = " $552";
        String modelA2 = "A3";
        String leasePriceA3 = " $412";*/
    }

