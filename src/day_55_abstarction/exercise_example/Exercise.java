package day_55_abstarction.exercise_example;

public abstract class Exercise {
    public void start(){ // <-- method created --> non-abstract because method does not have abstract keyword and implementation
        System.out.println("Warming up and starting the exercise");

    }
    /*
    abstract method below, without body just signature --> "void perform"
    purpose --> letting sub-classes implement/override their own way
     */
    public abstract void perform();
/*
* another abstract method that sub classes will override/implement
* parameters minutes -  how long is exercise is performed
* return number of calories burned/use
 */
    public abstract int getCaloriesCount(int minutes);


    }

