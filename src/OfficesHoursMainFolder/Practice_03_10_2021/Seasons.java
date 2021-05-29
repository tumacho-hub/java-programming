package OfficesHoursMainFolder.Practice_03_10_2021;
/*
 "season & day length"
 The seasons will determine how long each day and night are.
 The season be determined by a number:
 > 1 - Spring
  day: 14
  night: 10
  >2 - summer
  day : 16
  night : 8
  > 3 - fall
  day: 14
  night: 10
  > 4 - winter
  day: 12
  night: 12

 */
import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Enter the Season number of the year you like the most");
        int numberSeason = input.nextInt();

        int day = 0;
        int night = 0;
        String yearSeason = "";

        if (numberSeason == 1){
           yearSeason ="Sprint";
            day = 14;
            night = 10;

       }
       if (numberSeason == 2){
           yearSeason = "Summer";
           day = 16;
           night = 8;
       }
       if (numberSeason == 3){
           yearSeason = "Fall";
           day = 14;
           night = 10;
       }
       if (numberSeason == 4){
           yearSeason = "Winter";
           day = 12;
           night = 12;
       }
        System.out.println("In " + yearSeason + " there is " + day +" hours of daylight and " + night + " hours of night" );
    }
}
