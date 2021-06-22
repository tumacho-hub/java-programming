package day_55_abstarction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
/*
 Below Cannot create object/instantiate abstract class this will be an 'error'
   Exercise exercise = new Exercise();
 Another benefit or abstraction, we can have one variable of type abstract class and object can be any sub class.
 This is call POLYMORPHISM
 */
        Exercise exercise = new Running();
        Running running = new Running();
        Swimming swimming =  new Swimming();
        FreWeight freWeight = new FreWeight();


        exercise.start();
        exercise.perform();
        System.out.println("Running 30 mins - calories = "+exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 mins - calories = "+running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 mins - calories = "+ swimming.getCaloriesCount(30));

        freWeight.start();
        freWeight.perform();
        System.out.println("FreeWeight 30 mins - calories = "+freWeight.getCaloriesCount(30));
    }
}
