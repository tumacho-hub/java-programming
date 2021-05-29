package day_40_ArrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();

        System.out.println("size  = " + shoppingList.size());

        System.out.println("IsEmpty? = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }
        shoppingList.add("Shoes");
        shoppingList.add("Cheap monitor ");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }
        int count = shoppingList.size();
        System.out.println("items to buy = " + count);

        System.out.println("Is shoes in my list " + shoppingList.contains("Shoes"));
        if (shoppingList.contains("Shoes")) {
            System.out.println("Yes we have shoes in the list ");
        } else {
            System.out.println("Shoes is not in the list");
        }
        System.out.println("Buting shoes ... $80");

        shoppingList.remove("Shoes");
        System.out.println("List = " + shoppingList);

        System.out.println("Done shopping, get back to coding!");
        shoppingList.clear();
        System.out.println(shoppingList);
    }
}
