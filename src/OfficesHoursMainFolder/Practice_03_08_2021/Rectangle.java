package OfficesHoursMainFolder.Practice_03_08_2021;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
         ////  this is hardcoding example of it .. lets make the code  dynamic !!!
      /*  double length = 25;
          double width = 15;

        double perimeter = 2 * (length + width);
        double area = 2 * (length * width);

        System.out.println(perimeter);
        System.out.println(area);

       */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length ");
        double length = input.nextDouble();

        System.out.println("Enter the width ");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println( "Your perimeter is = " + perimeter);

        System.out.println("Enter the length ");
        double areaWidth = input.nextDouble();

        System.out.println("Enter the width ");
        double areaLength = input.nextDouble();
        double area =  2 * ( length * width);

        System.out.println("Your are is = " + area);
        }








    }


