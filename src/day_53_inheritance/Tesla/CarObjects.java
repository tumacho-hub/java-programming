package day_53_inheritance.Tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326);
        electricCar.drive(50);

        System.out.println(electricCar);
        System.out.println("electricCar.getMake() = " + electricCar.getMake());
        System.out.println("electricCar.getModel() = " + electricCar.getModel());
        System.out.println("electricCar.getPrice() = " + electricCar.getPrice());
        System.out.println("electricCar.getYear() = " + electricCar.getYear());
        System.out.println("electricCar.getRange() = " + electricCar.getRange());

        if (electricCar.getPrice() > 100000){
            System.out.println(electricCar.getMake() + " - " + electricCar.getModel() + " is out of my budget");
        }else {
            System.out.println(" purchasing " + electricCar);
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar electricCar1 = new ElectricCar("Tesla", "CyberTruck", 59900, 2022,300);

        System.out.println("electricCar1 = " + electricCar1); // call static method using object
        System.out.println("Count = " + ElectricCar.getCount());// call static method using Classname

        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster);
        roadster.drive(1000);
        roadster.drive(600);


        ModelX modelX = new ModelX("Tesla", "Model X", 89990.0, 2021, 360);
        System.out.println( modelX);
        System.out.println("Having lunch...");
        modelX.drive(10);
        System.out.println("Range remaining = " + modelX.getRange());
        System.out.println("Total electric cars count =" + ElectricCar.getCount());


    }
}
