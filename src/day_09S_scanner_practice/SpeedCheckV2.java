package day_09S_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed");
        int CurrentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overTheLimit = CurrentSpeed - speedLimit;
        System.out.println( "you are driving " + overTheLimit + "mph over the limit. Slow" +
                "down! ");
// second example of Scanner " REALLY FOCUS IN THIS ONE !!!
    }
}
