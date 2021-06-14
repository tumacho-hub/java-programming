package day_53_inheritance.Tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count; // all objects will share this variable
    private static final int MAX_RANGE = 350;


//this is my constructor public ElectricCar==(String make, String model, double price, int year, int range)
    public ElectricCar(String make, String model, double price, int year, int range) {
        setMake(make);// this.make = make;  useful when setter has some condition
     //  this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;
    }
    public static int getCount(){
        return count;
    }
    public final void charge(){
        System.out.println("Charging the electric car using plug-in");
        range = MAX_RANGE;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    protected void drive(int miles) {
        if (range == 0 || range-miles < 0){
            System.out.println("ERROR: cannot drive that far, need to charge");
        }else{
            range -=miles;
            System.out.println("Driving " + miles + "miles");
        }

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if ((make.isEmpty())) {
            System.out.println("Error: make can not be blank");
        } else {
            this.make = make;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;



    }
}