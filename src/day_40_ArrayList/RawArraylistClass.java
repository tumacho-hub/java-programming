package day_40_ArrayList;
import java.util.*;
import java.util.ArrayList;

public class RawArraylistClass {
    public static void main(String[] args) {
        // two ways of declaration for ARRAYS

        ArrayList list1 = new ArrayList();

        List list2 = new ArrayList();
        // add values
        list1.add("java");

        list1.add("apples");

        list1.add("coffee");

        list1.add(1234);

        list1.add(55.2);

        list1.add(true);

        list1.add("Wooden spoon");

        System.out.println(list1);
        System.out.println("size = " + list1.size());


    }
}
