package day_45_oop;

public class trafficLightObject {
    // created a traffic light object
    public static void main(String[] args) {
        // create trafficLight object

       TrafficLights light = new TrafficLights(); //this a new object

       light.changeColor("red");
       light.showColor();

       light.changeColor("green");
       light.showColor();
    }

}
