package day_54_abstration;

public class Pizza extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("Stretch the dough, put toppings, cheese and put it inside the oven ");

    }

    @Override
    public void serve() {
        System.out.println("Put in a big plate and cut in slides");

    }
}

