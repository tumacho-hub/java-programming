package OfficesHoursMainFolder.practice_06_22_2021;
/*

Create a concrete class Target
    - Inherit Shopping and implement all abstract methods
What does a concrete class mean? is the first non-abstract sub-class
 */
public class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying target from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");

    }
}
