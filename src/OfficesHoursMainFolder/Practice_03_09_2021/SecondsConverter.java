package OfficesHoursMainFolder.Practice_03_09_2021;
import java.util.Scanner;
public class SecondsConverter {
    /*
    Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total `seconds`.

- Create a Scanner object
- Declare int variables `inputSeconds, hours, minutes, seconds`
- Ask user enter seconds by printing:

    "Enter seconds:"

- Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in  `inputSeconds`.

- Assign values to the hours, minutes, seconds variables

- Display the result.

Example:
```
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
for this problem we first we need to find out how many seconds are in 1 hr ?
 ex:
  60 seconds = 1 minute
  60 minutes = 1 hour
  60 * 60


     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println( "Enter seconds: ");
    // int second = 1;
    // int minutes = second * 60;
    // int hour = minutes / 60;
     int inputSeconds;
     int hours;
     int minutes;
     int seconds;
     inputSeconds = input.nextInt();
     hours = inputSeconds / 3600;

     inputSeconds %= 3600;

     minutes = inputSeconds / 60;

     inputSeconds %= 60;

     seconds = inputSeconds;
        System.out.println(hours + " Hour, " + minutes + " minutes, " + seconds + " seconds ");
    }
}
