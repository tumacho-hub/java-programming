package day_63_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples2 {
    public static void main(String[] args) {
        Map<Integer,Person> map = new HashMap<>();
        map.put(32, new Person("",0));
        map.put(32, new Person("MJ",32));
        map.put(12,new Person("Nick",10));

        System.out.println(map.get(31));
        System.out.println(map.get(null));
        System.out.println(map.get(32));
        System.out.println(map);

        Map<Integer,Person> map2 = new HashMap<>();
        map2.put(32, new Person("",0));
        map2.put(null, new Person("MJ",32));
        map2.put(12,new Person("Nick",10));
        System.out.println("map2 = " + map2);

        Map<Integer,Person> map3 = new TreeMap<>();
        map3.put(32, new Person("",0));
        map3.put(0, new Person("MJ",32));
        map3.put(-12,new Person("Nick",10));
        System.out.println("map3 = " + map3);
    }

}
