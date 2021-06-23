package day_56_abstraction;

import day_56_abstraction.greeting.Greeting;
import day_56_abstraction.transportation.SelfDrivable;
import day_56_abstraction.transportation.Transportation;

public class Plane extends Transportation implements SelfDrivable, Greeting {
        @Override
        public void hi() {
                System.out.println("Welcome aboard");
        }

        @Override
        public void bye() {
                System.out.println("Thanks for flying with us");

        }

        @Override
        public void autoPiloting() {
                System.out.println("Flying on Auto-pilot mode");
        }

        @Override
        public void transportPeople() {
                System.out.println("Flying people from one city to city");

        }

        @Override
        public void cost(int mile) {
                System.out.println("Tesla cost " + (mile * 25.0) + " to drive " + mile + " miles");

        }


        public void land() {
                System.out.println("Plane is landing buck it up");
        }
}

