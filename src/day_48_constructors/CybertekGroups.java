package day_48_constructors;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {


        // dependency injection. Group object creation depends on String name
        Group group1 = new Group("cyberBugs");

        // print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("pavel");
        group1.addMember("berk");
        group1.addMember("elvin");
        group1.addMember("ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());

        System.out.println(group1.getMembers().toString());

        Group group2 = new Group("CybertCats");
        group2.setMembers(Arrays.asList("Stephan", " wakshum", "Akrem", "Bulent", "Andrea"));

        // how can we print all the members this will give us the whole list
        // or we can use loops for it
        System.out.println(group2.getMembers());
        //use if statement to check if Akrem is in group2
        if (group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is member of group2");

        }else{
            System.out.println("Akrem is not member of group2");
        }

        group1.removeMemberName("Berk");
        group1.removeMemberName("Rasim");
        System.out.println(group1);
    }

    }

