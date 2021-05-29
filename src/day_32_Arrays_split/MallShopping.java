package day_32_Arrays_split;
import com.sun.xml.internal.ws.streaming.TidyXMLStreamReader;

import java.util.*;
public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jackets", "gloves", "Airpods", "iPad", "iphone case"};
        double[] price = {99.99, 150, 9.99, 250.0, 439.50, 36.99};
        int[] itemsIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println("---------Find the first index of \"Gloves\" in items array---------");
        for (int i = 0; i < items.length; i++) {
            //   System.out.println(i + "-"+ items[i]);
            if (items[i].equalsIgnoreCase("Gloves")) {
                System.out.println("Gloves are found in Index = " + i);
                break;


            }
        }
        System.out.println("----------------jacket index is -----------");
        for (int j = 0; j < items.length; j++) {
            if (items[j].equalsIgnoreCase("jackets"))
                System.out.println("Jacket index is =" + j);
            break;
        }
        System.out.println("---------- Index of  iphoneCase is -----------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("iphone case")) {
                System.out.println("iphone case index is = " + i);
                break;
            }

        }
        System.out.println("------------ Set boolean to true if first ipad is found-----------");
        boolean iPadExist = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")) {
                iPadExist = true;
                break;
            }
        }
        System.out.println("iPadExist = " + iPadExist);

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "\t- \t$"+ + price[i] + " \t-\t#" + itemsIDs[i]);
        }
        System.out.println("---------- Look for jacket in items and print all details ----------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jackets"))
            System.out.println(items[i] + "\t- \t$"+ + price[i] + " \t-\t#" + itemsIDs[i]);
            break;


         }

    }
}









