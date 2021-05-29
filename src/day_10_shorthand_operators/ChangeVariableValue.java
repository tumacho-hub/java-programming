package day_10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3; ///variable =containers, 3 it means we are declaring
        System.out.println("count = " + count);
        //add, increasing by 2
        count += 2;
        System.out.println("count = " + count);
        
        int apples = 5;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);
        
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        ///get another whole small pizza just for you 6 slices
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        int players = 10;
        System.out.println("players = " + players);
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 2244;
        System.out.println("cents = " + cents);
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);
        
        
        
        
        
        
    }
}
