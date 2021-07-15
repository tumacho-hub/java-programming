package day_62_collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();
        states.add("MA");
        states.add("IL");
        states.add("Va");
        states.add("Tx");
        states.add("Co");
        states.add("MD");
        states.add("MD");
        System.out.println(states);

        //Vector is synchronized
    }
}
