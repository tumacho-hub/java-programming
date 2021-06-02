package day_48_constructors;

public class BUsObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        bus.engine = new Engine(10);
        System.out.println(bus.toString());

        Bus bus1 = new Bus();
        bus1.driver = new Driver("jorge");
        bus.engine = new Engine(15);



    }
}
