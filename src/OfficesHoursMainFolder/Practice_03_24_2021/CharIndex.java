package OfficesHoursMainFolder.Practice_03_24_2021;

public class CharIndex {
    public static void main(String[] args) {

        String word = "jorge";
        // be careful with the chartAt and length together because  you will get outOfBounds
        // make sure to use the length-1 wo we can stay in range and not get outofbounce !!
     //   System.out.println(word.charAt(word.length())); // OutOfBounce 1
        System.out.println(word.charAt(word.length()-1)); // correct method
        System.out.println(word.length());

        System.out.println(word.indexOf('j'));

        System.out.println(word.indexOf('e'));

        System.out.println(word.contains("J"));

        System.out.println(word.indexOf('j') >= 0 ? "Contains: " : "Not contains");




    }
}
