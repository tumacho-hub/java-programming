package day_65_collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorForList {
    public static void main(String[] args) {

        List<Double> list = new LinkedList<>(Arrays.asList(199.99d,71d,94d,104d,104d));

        System.out.println(list);

        //List iterator
        ListIterator<Double> listIterator = list.listIterator();
        System.out.println("listIterator.hasNext() : " + listIterator.hasNext());
        System.out.println("listIterator.nextIndex() : " + listIterator.nextIndex());

        while (listIterator.hasNext()){
            System.out.print("listIterator.nextIndex() : " + listIterator.nextIndex());
            Double item = listIterator.next();
            System.out.println(" | Item is = " + item);

            if ( item < 10){
                listIterator.remove();

            }
        }
        System.out.println(list);
        System.out.println("listIterator.hasPrevious() :" + listIterator.hasPrevious() );
    //    System.out.println("listIterator.previousIndex() = " + listIterator.previousIndex());
      //  System.out.println("listIterator.previous() = " + listIterator.previous());

        while(listIterator.hasPrevious()) {
            System.out.print("listIterator.previousIndex() = " + listIterator.previousIndex());
            Double item = listIterator.previous();
            System.out.println(" | item = " + item);

            if (item < 80) {
              //  listIterator.remove(); //we have two more additional method
              //  listIterator.set(200D); //            [199.99, 200.0, 94.0, 104.0, 104.0]   <<-- this method will allow us to change the value of units without removing them or replacing them
                 listIterator.add(1000D); //list = [199.99, 1000.0, 71.0, 94.0, 104.0, 104.0]
        //
            }
        }
        System.out.println("list = " + list);
    }
}
