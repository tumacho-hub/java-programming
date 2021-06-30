package day_57_abstraction_polymorphism.shapes;

//import java.util.ArrayList;
//import java.util.List;
//
//public class ShapeTest {
//    public static void main(String[] args) {
//        Shape triangle = new Triangle();
//        triangle.draw();
//        Shape circle = new Circle();
//        circle.draw();
//        Shape square = new Square();
//        square.draw();
//
//        /*
//single variable of parent type, and different objects of child class
//         */
//
//        Shape shape = new Triangle();
//        shape.draw();
//        shape = new Circle();
//        shape.draw();
//        shape = new Square();
//        shape.draw();
//        /*
//        create list of shapes and store 10 different shapes
//        using a loop print out each shape
//         */
//
//        List<Shape> listOfShapes = new ArrayList<>();
//        listOfShapes.add(new Triangle());
//        listOfShapes.add(new Square());
//        listOfShapes.add(new Square());
//        listOfShapes.add(new Circle());
//        listOfShapes.add(new Circle());
//        listOfShapes.add(new Triangle());
//        listOfShapes.add(new Square());
//        listOfShapes.add(new Square());
//        listOfShapes.add(new Circle());
//        listOfShapes.add(new Circle());
//
//        //   System.out.println(listOfShapes);   Prints HashCodes of objects
//        for (Shape eachShape : listOfShapes) {
//            eachShape.draw();
//        }
//        drawShape(new Circle());
//        drawShape(new Square());
//        drawShape(triangle);
//        /*
//        static methods: drawShape
//        accepts object of shape
//        then calls draw() methods
//         */
//
//    }
///*
//     instead of having to write multiple methods we can use the advantage og polymorphism and just create on method.
//    public static void drawShape(Circle shape) {
//        System.out.println("--- Drawing shape------");
//        shape.draw();
//
//    }
//
//    public static void drawShape(Square shape) {
//        System.out.println("--- Drawing shape------");
//        shape.draw();
//*/
//public static void drawShape(OfficesHoursMainFolder.Practice_06_08_2021.Shape shape) {
//    System.out.println("----Drawing shape----");
//    shape.draw();
import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        /**
         * single variable of parent type, and different objects of child types
         */
        Shape shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();

        /**
         * create list of Shapes and store 10 different shapes
         * using a loop print out each shape
         */
        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());

        //System.out.println(shapes); prints Hashcodes of objects
        for (Shape eachShape : shapes) {
            eachShape.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);
    }

    /**
     * static method: drawShape
     * accepts object of shape
     * then calls draw() method
     */
    public static void drawShape(Shape shape) {
        System.out.println("----Drawing shape----");
        shape.draw();
    }
}


