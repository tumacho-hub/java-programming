package day_29_NestedLoops_arrays.Recap_day_29;

import javax.swing.plaf.IconUIResource;

public class CountCharactersLoops {
    public static void main(String[] args) {
        String word = "jorge";

        for (int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer: " + word.charAt(outer));
            int count = 0;// it will reset the count to 0
            for (int inner = 0; inner < word.length(); inner++) {
                if (word.charAt(outer) == word.charAt(inner)) {
                    count++;
                }

            }
            System.out.println(word.charAt(outer) + "=" + count);
            System.out.println("-------------------------------------------------");
        }


        String word1 = "jorgejorge";

        for (int i = 0; i < word1.length(); i++) {
            int count = 0;
            for (int j = 0; j < word1.length(); j++) {
                if (word1.charAt(i) == word1.charAt(j)) {
                    count++;

                }
            }
            System.out.println(word1.charAt(i) + "=" + count);
        }
    }

    }

