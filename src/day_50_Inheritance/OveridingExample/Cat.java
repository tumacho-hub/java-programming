package day_50_Inheritance.OveridingExample;

public class Cat extends Animal {

    public void jump(){
        System.out.println("Cat is jumping");

    }
    @Override
public void speak(){
        System.out.println("Cat is saying Meow!!");

}

}
