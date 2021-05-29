package TEST;

import java.util.Scanner;

public class zombieAttack {
    /*
    A variable **inhabitants** represents a city and its respective populations. City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its population. Write a program to loop the city population and make it lose half of its population **until population is zero**. Print the each day like below for each day:
    Example - inhabitants are 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
Example- inhabitants are 0

---- EXTINCT ----
---- EXTINCT ----
Example- inhabitants are 20

Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----
this is a task that needs to be divisible by number 2 until is not longer divisible
we get out of the loop when the number is no longer divisible by two one of the reason why we need WHILE LOOP!
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inhabitants = input.nextInt();
        int day = 0;
        while (inhabitants > 0 ){
            System.out.println("Day " + day + "[" + inhabitants + "]" );
            inhabitants = inhabitants/2;
            day++;
        }
        System.out.println("---- EXTINCT ----");







    }
}