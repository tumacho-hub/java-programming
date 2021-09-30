package day_46_encapsulation.delership1;

public class Car {
    // private is an access modifier, when variable is private it can only be call in the same class!!
    //Example of encapsulation -> hiding data -> instance variables
    private String model;
    private int year;
    private int millage;

    // setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", millage=" + millage +
                '}';
    }

    // getter method for model
    public String getModel() {
        return model;

        /*
         the two blocks above get the complete encapsulation data.
         flow first set private value, and then probate setter and getters.
         */


    }

}



