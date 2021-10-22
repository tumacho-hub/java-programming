package day_65_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceMethods {
    public static void main(String[] args) {
        // below we are implementing all the methods that collections have, they are really similar to ArrayList

        Collection<Integer> coll = new ArrayList<>();

        //adding items one by one
        coll.add(3);
        coll.add(5);
        coll.add(7);

        System.out.println(coll);

        //adding multiple items in one shot
        coll.addAll(Arrays.asList(3,5,7,9,11,13,15));
        System.out.println(coll);

        //getting the size of the collection

        System.out.println(coll.size());


        //checking if it is empty or not?
        System.out.println(coll.isEmpty());

        //remove item
        coll.remove(15);
        System.out.println("after removing the value " + coll);

        //contains item
        System.out.println("coll.contains(15) = " + coll.contains(15));

        //contains all items
        System.out.println("coll.containsAll(Arrays.asList(9)) = " + coll.containsAll(Arrays.asList(9)));

        //remove all
        System.out.println("coll.removeAll(Arrays.asList(13)) = " + coll.removeAll(Arrays.asList(13)));
        System.out.println(coll);

        //retains All
        coll.retainAll(Arrays.asList(3, 5, 7));
        System.out.println(coll);

        //removeIf
        coll.removeIf( each -> each > 10);
        System.out.println(coll);

        //  Turning into Array
        Integer[] inArray = coll.toArray(new Integer[8]);
        System.out.println(Arrays.toString(inArray));


    }


    }
