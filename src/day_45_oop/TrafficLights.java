package day_45_oop;

public class TrafficLights {
    /// TEMPLE CLASS!!! DOES NOT DO ANYTHING just the idea
/// this is read only method, displays value of color variable
    String  color;

    public void showColor () {

        System.out.println(" Current color = " + color);

    }
    public void changeColor(String newColor){
        System.out.println("changing color to = " + newColor );
        color =newColor;

    }


}
