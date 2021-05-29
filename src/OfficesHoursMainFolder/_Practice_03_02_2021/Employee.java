package OfficesHoursMainFolder._Practice_03_02_2021;

public class Employee {
    /* Create a class Employee
     create a main method

    Declare and assign these variables according to the most appropriate dataTypes: (Use as many dataTypes as you can for practice)

        - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,

    Declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
            Ex: base: 100000
                start day: 2
                after 3 year: (100000 + (2 * 1000)) = 102000

    Display the values of the variables following given example image
*/

     public static void main(String[] args) {

        String name = "Jorge";
        String lastName = "Flores";
        String companyName = "Ford";
        double salary = 2500;
        String startingDay = "Monday";
        int startingMonth = 2;
        int startingYear = 2010;
        boolean isFullTime = true;
        String jobTitle =  "Manager";
        String officeAddress = "100 w washington st";

        String fullName = name + " " + lastName ;
        String fullStartDate = startingMonth + "." + startingYear;
        String email = name + startingDay + "@company" + companyName + ".com";
        double after3years = (salary + startingMonth * (1000));
         System.out.println( "Employee: " + fullName + "\n" + "Starting Date: " +fullStartDate + "\n" + "Employee email: " + email + "\n" +
                 "Salary raise after 3 years; " + after3years +"\n"+ "Is Full Time: " +isFullTime + "\n" + "Job Title: " + jobTitle + "\n" +
                 "Office Address: " + officeAddress);



    }

}
