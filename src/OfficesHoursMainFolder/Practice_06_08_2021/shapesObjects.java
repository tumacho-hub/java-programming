package OfficesHoursMainFolder.Practice_06_08_2021;

import java.util.concurrent.Callable;

public class shapesObjects {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.CalculateArea();

        Square square1 = new Square();
        square1.side = 5;
        square1.CalculateArea();
        square1.CalculatePerimeter();
        System.out.println(square1);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3;
        rectangle1.length = 4;
        rectangle1.CalculateArea();
        rectangle1.CalculatePerimeter();
        System.out.println(rectangle1);

        Circle circle1 = new Circle();
        circle1.radius = 10;
        circle1.CalculateArea();
        circle1.CalculatePerimeter();
        System.out.println(circle1);


    }


    }

