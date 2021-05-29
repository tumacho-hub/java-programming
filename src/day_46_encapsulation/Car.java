package day_46_encapsulation;

public class Car {

// encapsulated/hidden variables

    private String model;// this method is access modifier, when variable is private is only
    private int year;
    private int mileage;

    // setter method for model
    public void setModel(String carModel){
        model = carModel;
    }
    // getter method for  model
    public String getModel(){
        return model;
        // the example above it a complete example of ENCAPSULATION
    }
// setter for year
    public void setYear(int year){
        this.year = year;
    }
// getter for year
    public int getYear(){
        return year;
    }
    // setter for mileage
    public void setMileage(int mileage){
        this.mileage = mileage;

    }
    // getter
    public int getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}

