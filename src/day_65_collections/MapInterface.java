package day_65_collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();

        //---------------Map Interface Methods------------------

        // V put ( K key, V value)
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);
        System.out.println(scoreMap);

        //int size
        System.out.println(scoreMap.size());

        // V get(Object key)
        System.out.println("Mary's score : " + scoreMap.get("Mary"));
        System.out.println("Adam's score : " + scoreMap.get("Adam"));

        //boolean isEmpty
        System.out.println("Map is empty? " + scoreMap.isEmpty());

        // bo0lean containsKey(Object key)
        System.out.println("is John in this scoreMap ? " + scoreMap.containsKey("John"));

        //adding duplicate key <<-- FYI, if a duplicate key exist it won't work, but it the value is not the same it will update the value
        scoreMap.put("Mary", 100);
        scoreMap.put("Mary", 99);
        System.out.println(scoreMap);

        //boolean containsValue(Object value)
        System.out.println("is value 100 in this scoreMap ? " + scoreMap.containsValue(100));
        System.out.println("is value 100 in this scoreMap ? " + scoreMap.containsValue(99));

        // V remove (object)
        System.out.println("remove key : Adam " + scoreMap.remove("Adam"));

        // void putAll(Map<? extends K, ? Extends V>m);
        Map<String, Integer> scoreMap2 = new HashMap<>();
        scoreMap2.put("Diana",80);
        scoreMap2.put("Alex",92);
        scoreMap2.put("Beian",70);
        System.out.println("scoreMap2 = " + scoreMap2);

        scoreMap.putAll(scoreMap2);
        System.out.println("scoreMap = " + scoreMap);

        //Void clear()
        scoreMap2.clear();
        System.out.println("scoreMap2 = " + scoreMap2);

        //Java 8 addition
        // V putIfAbsent (K key, V value)
        scoreMap.putIfAbsent("Mary", 100);
        System.out.println("scoreMap : " + scoreMap);

        // V getOrDefault(Object key, V defaultValue)
        System.out.println("Get Alex's score " + scoreMap.get("Alex"));
        System.out.println("Get Alex's score, if not found return 60 " + scoreMap.getOrDefault("Alex", 60 ));

        //boolean remove (Object key, Object value) <-- this will only remove on parameter
        //and the value has to match exactly otherwise it will not remove it.
        System.out.println("remove Brian's score " + scoreMap.remove("Brian"));
        System.out.println("ScoreMap : " + scoreMap);

        //boolean replace(k key, V newValue)
        System.out.println("Replace Mary score from 92 to 100 " + scoreMap.replace("Mary",100) );
        System.out.println(scoreMap);

        //boolean replace(k key, V oldValue, V newValue)
        System.out.println("Replace Mary score from 100 to 90 " + scoreMap.replace("Mary",100, 90) );
        System.out.println(scoreMap);























    }
}
