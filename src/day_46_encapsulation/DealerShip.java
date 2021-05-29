package day_46_encapsulation;

public class DealerShip {
    public static void main(String[] args) {

        Car car1 = new Car();

//      car1.model = "Nissan Altima";
//      car.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = "+ car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = "+ car1.getYear());
        car1.setMileage(10742);
        System.out.println("Car1 mileage = " + car1.getMileage());
        System.out.println(car1.toString());
        System.out.println(car1); // automatically calls the method

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo car giulia TI AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);
        System.out.println(alfaRomeo);
    }

}
