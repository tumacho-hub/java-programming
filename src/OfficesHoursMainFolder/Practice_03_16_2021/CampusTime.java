package OfficesHoursMainFolder.Practice_03_16_2021;
/*
Campus time: User enters a time (hour in 24 format) and will be able to find out if the campus is open or not
> Campus is open from 8 AM(8) to 11PM(23)
> If user enters a time within the open time they should see a message : "open"  but if the time entered is outside of
operating hours they should see: "closed"
> If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message:"invalid time"
 */
import java.util.Scanner;
public class CampusTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a time ");


        int opentime = input.nextInt();




        if (opentime < 8  || opentime > 24){
            System.out.println("Invalid time ");

        }else if ( opentime >= 8 && opentime <= 23){
            System.out.println("campus is open");
        }else {
            System.out.println("campus is closed");
        }




        }
    }


