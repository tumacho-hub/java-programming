package day_59_polymorphism_exceptions;

import OfficesHoursMainFolder.Practice_06_08_2021.Circle;
import OfficesHoursMainFolder.Practice_06_08_2021.Shape;
import OfficesHoursMainFolder.Practice_06_08_2021.Square;

public class InstanceOf {
    public static void main(String[] args) {
        // instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

         if (shape instanceof Circle){
             System.out.println("It is a circle object");
         } else if (shape instanceof Square) {

             System.out.println("It is a Square object");
         }

      //  System.out.println(shape.getClass().getSimpleClass);
        System.out.println(shape.getClass().getClass());

         if (shape.getClass().equals("Square")){
             System.out.println("it is a square object");
         }
        System.out.println(shape.getClass().getDeclaredMethods().length);

         WebElement el = new Link();
        System.out.println("object class name of el variable =" + el.getClass().getSimpleName());
        System.out.println(el.getClass().getDeclaredFields());
    }
}
