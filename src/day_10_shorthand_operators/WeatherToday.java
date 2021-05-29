package day_10_shorthand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        //weather sunny,raining very cold very hot
        //import scanner
        //create scanner object
        //ask a question:
        //how its the weather today?
        //"cold
        //cold is a nice day today
        //there is small BUG/GLITCH with nextLine():
        //Scanner scan = new Scanner(system.in);
        //System.out.println(Enter values"
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today");
       // String weather ="rainy";
        String weather = scan.nextLine(); /// if we add line it will do double lines
        System.out.println(weather + " is a nice day" );







    }
}
