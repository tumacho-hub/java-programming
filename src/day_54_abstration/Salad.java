package day_54_abstration;

public class Salad extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("chop veggies and add dressing");

    }

    @Override
    public void serve() {
        System.out.println("Serve with in a bowl and serve with fork");

    }
}
