package day_19_Class_vs_Object_String;

public class StringComparison {
    public static void main(String[] args) {
        // String manipulation methods to process the "value" !
        String city = "Chicago";
        // equals compares string with another string and returns true o false. it is case sensitive comparison.
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago "));
          //EQUALSIGNORECASE() method - CASE INSENSITIVE COMPARISON

        System.out.println(city.equalsIgnoreCase("chicago"));
        System.out.println(city.equalsIgnoreCase(" CHicago"));
        //we can use equals, and equalsIgnoreCase in if statement, because they return true or false/boolean


    }
    }

