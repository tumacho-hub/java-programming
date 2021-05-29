package day_32_Arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jackets", "gloves", "Airpods", "iPad", "iphone case"};
        double[] prices = {99.99, 150, 9.99, 250.0, 439.50, 36.99};
        int[] itemsIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemsIDs));

        double maxPrice = prices[0]; // assume first price is max
        int indexOfMaxPrice = 0; // assume max price is at index 0

        for (int i = 0; i < prices.length; i++) {
          //  System.out.println(prices[i]);
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;

            }

        }
        System.out.println("max price " + maxPrice + "\n"+ "index of max prices =" + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + "-$" + prices[indexOfMaxPrice] + " -# "+ itemsIDs[indexOfMaxPrice]);

    }
}
