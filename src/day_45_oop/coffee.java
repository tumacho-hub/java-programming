package day_45_oop;

public class coffee {

    int amount;
    String type;


    public void drink(int someAmount) {
        amount -= someAmount;

    }

    public void refill() {
        int num = 100;

    }

    public int getAmount() {
return amount;

    }
    public void setType(String newType) {
        type = newType;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
