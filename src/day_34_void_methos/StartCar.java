package day_34_void_methos;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shitToDrive();
        pressGasPedal();
    }
    public static void pressGasPedal(){
        System.out.println("4. Hold steering wheel with 2 hands and press gas pedal");

    }
     public static void seatInCar(){
            System.out.println("1.Open the door and seat in driver seat ");
    }
     public static void startTheCar() {
         System.out.println("2.Insert key to ignition and turn clockwise ");
     }
     public static void shitToDrive() {
         System.out.println("3.Press brake pedal and shift to 'D");
     }
    }

