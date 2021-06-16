package day_54_abstration;

public class Food_Is_Ready {
    public static void main(String[] args) {

        Salad salad = new Salad();
        salad.prepare();
        salad.serve();

        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.serve();



    }
}
