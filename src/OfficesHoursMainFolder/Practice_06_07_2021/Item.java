package OfficesHoursMainFolder.Practice_06_07_2021;

public class Item {


        String name;
        double price;
        int quantity;

        public Item(String name, double price, int quantity){
            this.name = name; // this refers to the instance variable class
            this.price = price;
            this.quantity = quantity;

        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    '}';
        }
    }

