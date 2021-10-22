package java_java_final;

import BookCamp.Array;

import java.util.*;

public class iterator {
    /*
    For example to remove a duplicate from ArrayList we can also use Iterator

     */
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(100,100,100,200,200,300,300,400,400,100));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next() < 300){
                it.remove();
            }
        }
        System.out.println(list);

    }
}
