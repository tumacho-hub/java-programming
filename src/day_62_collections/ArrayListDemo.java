package day_62_collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>();//polymorphism
        Collection<String> school = new ArrayList<>();//polymorphism

        cities.add("McLean"); // add method from Collection or List Interface
        cities.add("Vieena");
        cities.add("New York");
        cities.add("New York");

        System.out.println(cities);

        System.out.println("First city: " + cities.get(0));
        System.out.println("Count of cities = " + cities.size());

    }
}
