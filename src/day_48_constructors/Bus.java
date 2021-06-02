package day_48_constructors;

//import java.sql.Driver;
//
//public class Bus {
//
//    Engine engine;
//    Driver driver;
//
//    public  String toString(){
//        return driver.getName() +" | "+ engine.getCylinders();

public class Bus {
    Driver driver;
    Engine engine;

    public String toString() {
        return driver.getName() +" | "+ engine.getCylinders();
    }

}
