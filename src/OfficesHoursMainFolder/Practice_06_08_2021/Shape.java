package OfficesHoursMainFolder.Practice_06_08_2021;

public class Shape {
    // inheritance in java is concepts that allows us to create classes and pass information to another classes
    //  the ability to write a class and  pass the info to another class
    // implementation means "what the method will do"
    /*
    1. Create a class called Shape
- variables: area, perimeter
- methods: calculateArea(), calculatePerimeter()

2. Create sub classes of Shape: Circle, Rectangle, Square
- give the instance variables that are needed to calculate the Area, perimeter, of those shapes
     */
    double area;
    double perimeter;

    public void CalculateArea() {
        System.out.println("Shape Area");

    }


    public void CalculatePerimeter() {
        System.out.println("Shape Perimeter");


    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';

    }



    }



