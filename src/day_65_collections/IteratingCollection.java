package day_65_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingCollection {
    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>(Arrays.asList(3,4,5,2,66,544,31));
        System.out.println(coll);

        //how can we Iterate using the Iterator
         Iterator<Integer> myIter = coll.iterator();

         //hasNext()
        System.out.println(myIter.hasNext());
//
//        //next()
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//
//        // remove()
//        myIter.remove();
//        System.out.println(coll);

        // now if we want to remove certain items from the list now we would hve to combine hasNext(),next(),remove() methods
        // because the for each loop won't be able to iterate through each single item. therefore, we use a while loop where
        // we are able to combine all the methods

        while(myIter.hasNext()){
            Integer each = myIter.next();
            System.out.println(each);
            if(each > 10){
                myIter.remove();

            }


        }

        System.out.println(coll);
        System.out.println(myIter);

    }
}
