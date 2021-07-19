package day_63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        // list -> ArrayList

        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(100);

        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        words.remove("world");
        System.out.println(words);


        for (String word : words) {

        }

        // convert your Set to a List

        List<String> wordsList = new ArrayList<>(words);
        wordsList.add("world");
        System.out.println(wordsList);


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("$#");
        treeSet.add("53");
        treeSet.add("apple");
        treeSet.add("jeva");
        treeSet.add("cucumber");
        System.out.println(treeSet);
    }
}