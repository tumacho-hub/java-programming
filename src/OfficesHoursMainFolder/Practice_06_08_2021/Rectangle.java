package OfficesHoursMainFolder.Practice_06_08_2021;

public class Rectangle extends Shape {
    double length;
    double width;


    @Override
    public void CalculateArea() {
        area = length * width;

    }

    @Override
    public void CalculatePerimeter() {
    perimeter = 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

