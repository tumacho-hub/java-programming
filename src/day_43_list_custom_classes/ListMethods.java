package day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println(getDays());

        System.out.println("getDays()= " + getDays().size());

        System.out.println("getDays()= " + getDays().get(0));

        List<String> dayNames =  getDays();

        System.out.println("dayNames = " + dayNames);

        dayNames.add("java day");

        dayNames.removeIf( day -> day.length() == 6);

        System.out.println("dayNames after removeIf = " + dayNames);

    }
    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday , Tuesday, Wednesday< Thursday, Friday, Saturday, Sunday"));
        return days;
        }

    }

