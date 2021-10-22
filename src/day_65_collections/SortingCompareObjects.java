package day_65_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.util.concurrent.Callable;

public class SortingCompareObjects {



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("John");
        list.add("Mary");
        list.add("Diana");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println();
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        List<PersonClass> personList = new ArrayList<>();
        personList.add(new PersonClass("John",20));
        personList.add(new PersonClass("Adam",32));
        personList.add(new PersonClass("Mary",10));

        System.out.println(personList);
        Collections.sort(personList);
        System.out.println("personList = " + personList);

    }
}
