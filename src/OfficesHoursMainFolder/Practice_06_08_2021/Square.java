package OfficesHoursMainFolder.Practice_06_08_2021;


    public class Square extends Shape {

        double side;

        @Override
        public void CalculateArea() {
            area = side * side;

        }

        @Override
        public void CalculatePerimeter() {
            perimeter = side * 4;
        }
}
