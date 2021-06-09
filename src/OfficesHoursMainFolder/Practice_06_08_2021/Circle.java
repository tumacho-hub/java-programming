package OfficesHoursMainFolder.Practice_06_08_2021;

public class Circle extends Shape {
    double radius;
    double diameter = radius *2;

    @Override
    public void CalculateArea(){
        super.CalculateArea();
        area = Math.PI * (radius * radius);
    //    Math.pow(radius, 2);
    }
    @Override
    public void CalculatePerimeter(){
        super.CalculatePerimeter();
        perimeter = 2 * Math.PI * radius;


    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
