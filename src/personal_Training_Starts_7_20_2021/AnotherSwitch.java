package personal_Training_Starts_7_20_2021;
/*
[Office Hours Schedule]
Given some Day(String) print out the office hours schedule for that day if there is office hours.
Monday, Tuesday, Wednesday:
Print: Office hours at 5:30 -6:45 EST
Thursday:
Print: Soft Skills day
Friday:
Print: Day off
Saturday, Sunday:
Print: Already a long day, no office hours.
Any other String:
Print: Invalid day given
 */
public class AnotherSwitch {
    public static void main(String[] args) {

        String someDay = "march";
        switch (someDay){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;

            case "Thursday":
                System.out.println("Soft Skills Day");
                break;
            case "Friday":
                System.out.println("Day Off");
            case "Saturday":
            case "Sunday":
                System.out.println("Already a long day, no office hours.");
                break;
            default:
                System.out.println("invalid day given");
        }
        System.out.println(someDay);
    }
}
