package day_46_encapsulation.delership1;

import java.util.concurrent.Callable;

public class DealerShip {
    public static void main(String[] args) {
        //   how do we add a new object of the car
        Car car = new Car();
        //   car.model = "nissan"; this will give us an ERROR because the instance variable is private

        car.setModel("Nissan Altima");
        System.out.println(car.getModel());

        car.setMillage(102204);

        car.setYear(2014);

        System.out.println(car.getModel() + ", " + car.getYear() + ", " + car.getMillage());

        System.out.println(car);

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Ford");
        alfaRomeo.setYear(2018);
        alfaRomeo.setMillage(24000);

        System.out.println(alfaRomeo);
    }
}
