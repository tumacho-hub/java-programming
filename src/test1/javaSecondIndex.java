package test1;

import java.util.*;

public class javaSecondIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.contains("bread")){
            int firstBread = word.indexOf("bread");

            if (word.substring(firstBread+5).contains("bread")){
                int secondBread =  word.lastIndexOf("bread");
                System.out.println(word.substring(firstBread+5, secondBread));
            }else{
                System.out.println("nothing");
            }


        }else{
            System.out.println("nothing");
        }

    }




    }

