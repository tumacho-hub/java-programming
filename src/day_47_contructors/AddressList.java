package day_47_contructors;

import day_47_contructors.Address;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address(); // calling the constructor automatically
        cybertekAddress.setStreet("7925 Jones Branch Dr Suit 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " +cybertekAddress.toString());

        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        System.out.println("Address after update = " +cybertekAddress);

        System.out.println("Stree info = "+ cybertekAddress.getStreet());

        Address newAddrees = new Address();
        System.out.println(newAddrees.toString());


        Address oldCrip = new Address();





    }
}
