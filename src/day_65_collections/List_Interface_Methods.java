package day_65_collections;

import java.util.LinkedList;
import java.util.*;
import java.util.List;

public class List_Interface_Methods {
    public static void main(String[] args) {

        ///common List methods on top of the methods from collection interface
        List<Double> list = new LinkedList<>(Arrays.asList(3d,4d,27d,66d,3d,3d,44d));

        System.out.println(list);

        //accessing items using index
        System.out.println("first item : list.get (0) : " + list.get(0));

        //adding items in certain index
        list.add(1,5d);
        System.out.println(list);

        //updating items in certain index
        list.set(0,99.0);
        System.out.println(list);

        //getting indexes of certain items
        System.out.println("list.indexOf(4.0) = " + list.indexOf(4.0));
        System.out.println("list.indexOf(4.0) = " + list.indexOf(3.0));
        System.out.println("list.lastIndexOf(3.0) = " + list.lastIndexOf(3.0));
        System.out.println("if item is not found : " + list.indexOf(100.0)); // if item not found it will throw a -1 fyi

        //remove by index
        list.remove(1);
        System.out.println(list);

        //addAll at certain index
        list.addAll(2,Arrays.asList(99d,89d));
        System.out.println(list);

        System.out.println("remove second item : list.remove(1) " + list.remove(1));

        //replaceAll (Function : UnaryOperator)
        System.out.println("replace each item with new value increased by 5 : " );
        list.replaceAll( each -> each+5);
        System.out.println(list);

        // sort with comparator which is an interface will sort the number from ascending order
        //  list.sort(null);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    //    list.sort(Comparator.reverseOrder());
        System.out.println(list);

        //getting view out of list object
        //view is part of your original list object
        // subList (from,to)

        System.out.println("List view from Index 3 till before  7 \n" + "list.sublist3,7 : " + list.subList(3,7));


        List<Double> partOfListView = list.subList(2,5);
        System.out.println(partOfListView);
        partOfListView.set(0,199.99);
        System.out.println(partOfListView);
        System.out.println(list);


    }

}
