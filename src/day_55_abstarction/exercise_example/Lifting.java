package day_55_abstarction.exercise_example;
/*
 abstract class can have another abstract subclass. In that case, subclass does not need to override abstract methods.
 First concrete, non abstract child class will override all abstract methods
 */
public abstract class Lifting extends Exercise{

    public abstract void endLift();

}
