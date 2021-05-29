package day_13_Conditional_statememnts;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false; //2 different ways

       // if (isHungry == true)
       // if (isHungry) either or will work bevcause is boolean

        if (isHungry) {
            System.out.println(" i am hungry, i will go get tacos");
            System.out.println("i am not hungry i dont want tacos");
        }else {
            System.out.println("i am not hungry, leave me alone");
        }

       double price = 130.44;
        boolean isAffordable =  price >= 200.0; //200 is budget

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("i can afford it lest buy");
        } else {
            System.out.println("too expensive, lets keep coding java");
        }

        boolean isRemotejob = true;
        //if it not remotejob print"sorry am not interested"
        //otherwise,print "sure i am interested, what is the interview process?"
        if (!isAffordable) { //or shortcut (!isremotejob)
            System.out.println("sorry, i am not interested");
        } else {
            System.out.println("sure, i am interested, what is interview process?");
        }

    }
}
