package day_55_abstarction.exercise_example;

public class Swimming extends Exercise{
    @Override
    public void perform() {
        System.out.println("Performing swimming in the pool or ocean ");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}
