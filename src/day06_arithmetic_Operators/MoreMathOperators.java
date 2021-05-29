package day06_arithmetic_Operators;

public class MoreMathOperators {
    public static void main(String[] args) {

        int toyota = 431;
        int hondas = 233;
        int vw     = 2;
        int tesla  = 20;
        int Nissan = 1;
        int bmw    = 155;

        int totalcarsinparking = toyota + hondas + vw + tesla + Nissan + bmw;
        System.out.println("There are " + totalcarsinparking + " in parking lot.");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        /// there are 2 slices per person

        System.out.println("There are " + slicesPerPerson + " slices per person.");
        // we ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " Pizza with " + slices +
                " slices, " + people + " people ate pizza." );




    }
}
