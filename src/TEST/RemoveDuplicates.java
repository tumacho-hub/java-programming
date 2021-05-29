package TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    /*
     this method will take an ArrayList of numbers and remove any duplicates values.
     the method will return ArrayList of unique elements.
     @param nums-  the given ArrayList of numbers
     @return - ArraList of numbers
     ex:
     Input {1,3,5,1,4,5,9}
     output: {3,4,9}
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9, 2, 9));
        System.out.println(removeDuplicates(list));
        System.out.println(removeDuplicates2(list));
    }


    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniques = new ArrayList<>();
        String checked = "";

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            if (!checked.contains("" + list.get(i))) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;

                    }
                }
                if (count == 1) {
                    uniques.add(list.get(i));
                }
                checked += list.get(i) + "";
            }

        }
        return uniques;
    }

    public static ArrayList<Integer> removeDuplicates2(ArrayList<Integer> list) {
        list.removeIf(each -> Collections.frequency(list,each) > 1);
        return list;
    }
}

