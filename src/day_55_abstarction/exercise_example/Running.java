package day_55_abstarction.exercise_example;

public class Running extends Exercise {


    @Override
    public void perform() {
        System.out.println("Performing Running Exircise ");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13 ;
    }
}
