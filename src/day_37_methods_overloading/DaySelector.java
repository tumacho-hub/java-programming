package day_37_methods_overloading;

import java.util.Arrays;

/*
add new class DaySelector
add new method: getDayName
input : int day
return : String

1 - "Monday"
2 - "Tuesday"
...
7 - "Sunday"
any other:
    print "invalid day"
        return empty

getDayName(1); => "Monday"
getDayName(5); => "Friday"
getDayName(10); => print "Invalid day" -> ""
 */
public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(2));
        System.out.println(getDayName(7));
        System.out.println(getDayName(8));
        System.out.println("--------after loop-------");
        for (int i=1; i<9; i++){
            System.out.println(i + "-" + getDayName(i));
        }
        System.out.println("------------String into variable------------");
        // store getdayname into variable, and print variable
        String day = getDayName(5);
        System.out.println("Today is : "+ day);

        String someDay = getDayName(0);
        System.out.println("Someday = "+ someDay);

        if (someDay==null){
            System.out.println("Someday is null for invalid day");
        }
        System.out.println("------- getdaynamev2---");
        System.out.println(getDayNameV2(2));

        }


        public static String getDayName ( int day) {

            switch (day) {
                case 1:
                    return "Monday";
                //break; // unreachable code, because return already exist the method
                case 2:
                    return "tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
                default:
                    System.out.println("Error : Invalid day  - " + day);
                    return null;
            }
        }
            public static String getDayNameV2(int day) {
                String dayName;
                switch (day) {
                    case 1:
                        dayName = "Monday";
                        break;
                    case 2:
                      dayName =  "Tuesday";
                        break;
                    case 3:
                       dayName = "Wednesday";
                        break;
                    case 4:
                        dayName = "Thurday";
                        break;
                    case 5:
                        dayName = "Friday";
                        break;
                    case 6:
                        dayName = "Saturday";
                        break;
                    case 7:
                        dayName = "Sunday";
                        break;
                    default:
                        System.out.println("Invalid day - " + day);
                        dayName = null;

                }
                return dayName;
            }

        }



