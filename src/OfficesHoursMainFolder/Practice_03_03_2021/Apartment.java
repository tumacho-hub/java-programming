package OfficesHoursMainFolder.Practice_03_03_2021;
import java.util.Scanner;
public class Apartment {

 /*   create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

       - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers,
         allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station,
         number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */

   /*    public static void main(String[] args) {
        String address = "5738 w superior ";
        String ownerName = " Aresito";
        int unitNumber = 8;
        double averageSizesPerUnit = 1200.0;
        int monthlyRentCost = 900;
        int washerDryers = 4;
        boolean allowsPets = true;
        boolean hasPool = false;
        int lengthLease = 1;
        int totalResidentsInBuilding = 35;
        long ownerPhone = 312_123_4567L;
        boolean isNearGasStation = true;
        int numberOfFloors = 3;
        boolean hasABasement = true;
        boolean availableUnitForRent = true;
        boolean hasAC = false;
        int numberOfParkingSpaces = 50;
        boolean hasWheelChairAccess = false;
        int reviewStars = 3;


        double monthlyRentAfterThreeYears = (monthlyRentCost * .10);
         double monthlyRentAfterSixYears = (monthlyRentCost * .20);
         double numberOfResidentsPerUnit = (totalResidentsInBuilding / unitNumber);
         double numberOfParkingSpotPerUnit = ( numberOfParkingSpaces / unitNumber);
         double NumberOfUnitsPerFloor =  ( unitNumber / numberOfFloors);
        System.out.println("Discount 10% off original rent after 3 years $" + monthlyRentAfterThreeYears);
        System.out.println("Discount 20% off original rent after 6 years $" + monthlyRentAfterSixYears);
        System.out.println("Average number of residents per unit " + numberOfResidentsPerUnit);
        System.out.println("Average number of parking spots per unit " + numberOfParkingSpotPerUnit);
        System.out.println("Average number of units per floor " + NumberOfUnitsPerFloor);

    */
    /* Write a program that outputs the number of hours, minutes, and seconds that
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

     */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the seconds you wish to convert: ");
       int seconds = input.nextInt();
       int minutes =  seconds / 60;
       int hours = minutes / 60;
       int hoursleft = hours / 60;
       System.out.println(hoursleft );


   }



    }


