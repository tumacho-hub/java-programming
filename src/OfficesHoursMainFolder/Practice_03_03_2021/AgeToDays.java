package OfficesHoursMainFolder.Practice_03_03_2021;

public class AgeToDays {
    public static void main(String[] args) {
        /*
        make a class AgeToDays
        create a main method
        ---  declare two int variables : age and age in days
        ---  use a base of 365 days in year
        ---  calculated and display:
              You are $age years old! that means you are $ days days old
         */
        int age = 33;
        int ageDays = 365; // 365 * age
        System.out.println("You are " + age + " years old! that means you are "+ (age * ageDays) + " days old");
    }
}
