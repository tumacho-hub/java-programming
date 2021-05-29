package test1;
import java.util.Scanner;
public class clocktask {
    public static void main(String[] args) {
         // two ways to make this code simple for beginner below
        Scanner input = new Scanner(System.in);
      //  int hour;
      //  int minutes;
       // int seconds;
     //   String amOrpm;
         // dynamic code get use to it now

        int hour, minutes, seconds;
        String amOrpm;
        hour = input.nextInt();
        minutes = input.nextInt();
        seconds = input.nextInt();
        amOrpm = input.next();
        System.out.println( hour + ":" + minutes + ":" + seconds + " " + amOrpm );



    }


}
