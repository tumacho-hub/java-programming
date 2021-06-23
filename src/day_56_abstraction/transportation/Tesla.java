package day_56_abstraction.transportation;

import day_56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people in the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost " + (mile * 0.10) + " to drive " + mile + " miles");

    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving autonomos ");
    }

    @Override
    public void hi() {
        System.out.println("Tesla is saying ' hello hello peep peeep' " );
    }

    @Override
    public void bye() {
        System.out.println("bye bye ");

    }
}
