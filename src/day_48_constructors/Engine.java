package day_48_constructors;

public class Engine {

private int cylinders;

public Engine(){

}
public  Engine(int Engine){
}

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "cylinders=" + cylinders +
                '}';
    }
}
