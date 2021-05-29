package OfficesHoursMainFolder._Practice_03_02_2021;

public class PersonInfo {
    public static void main(String[] args) {
        /*
        Printing, variables, datatypes, concatenation
================================================

Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information
         */
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeason, year;
        double birthDate;

        name = "Jorge";
        age = 34;
        gender = 'M';
        student = true;
        numberOfSiblings = 4;
        favoriteNumber = 13L;
        numberOfSeason = 4;
        birthDate = 8.8;
        year = 1986;
        fullBirthDate = "" + birthDate + "." + year;
        favoriteQuote = "ponte chingon!!";
        System.out.println("Person Information");

        System.out.println("Name: " + name + "\n" +  "age: " + age +"\n" + "gender: " + gender + "\n" + "Student:" + student
        + "\n" + "Number of Siblings: " + numberOfSiblings + "\n" + "Favorite Number: " + favoriteNumber + "\n" + "Seasons of the year in your area: " + numberOfSeason
        + "\n" + "Full birth date: " + fullBirthDate + "\n" + "Favorite Quote: " + favoriteQuote );



    }
}
