package day_63_collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Jamie");
        list.add("Jorege");
        System.out.println(list);

        Iterator<String> it = list.iterator();

        it.next();
        it.remove();
        System.out.println(list);

        Set<String > names = new HashSet<>();
        names.add("james");
        names.add("Kinga");
        names.add("MJ");
        names.add("John");
        names.add("Pavrin");

    Iterator<String > iterator = names.iterator();
    while(iterator.hasNext()){
        String currentName = iterator.next();
        System.out.println(currentName);
        if (currentName.length() < 3){
            iterator.remove();

        }
    }
        System.out.println(names);
    }
}
