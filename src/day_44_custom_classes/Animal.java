package day_44_custom_classes;

public class Animal {

    String type = "some animal";

    // this example is to create attributes / behavior below
    public  void eat() {
        System.out.println("Eating");
    }




    public void eat(String food){
        System.out.println("eating " + food);
    }
    public void speak(){
        System.out.println("speaking");
    }

}

