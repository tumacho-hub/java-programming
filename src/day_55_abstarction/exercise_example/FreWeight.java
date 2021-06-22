package day_55_abstarction.exercise_example;
/*
FreeWeight class is first non abstract sub class.That's why, it must be override all
inherited abstract methods. Both from lifting and exercise
Perform and getCaloriesCount  are being overridden that are from Exercise abstract class
endLift this method is being overridden that is from lifting abstract class
 */
public class FreWeight extends Lifting{
    @Override
    public void perform() {
        System.out.println("Lifting Free Weight dumbbells");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");

    }
}
