package day_56_abstraction.transportation;

public interface SelfDrivable {

void autoPiloting();
     //void selfPark(); this causes error, in sub-classes because they must override abstract method
    // below default keyword only works in interface ---> 'public default void selfPark(){<-- this will not break your code !!
        public default void selfPark(){
        System.out.println("Performing self park ");

    }

}
