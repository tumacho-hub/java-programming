package day_29_NestedLoops_arrays;

public class StringNestedLoopsLength {
    public static void main(String[] args) {
        // index       0123
        String word = "java";

        for (int i = 0; i <= word.length() - 1; i++) {
            for (int j = 0; j <= i; j++) { // (int j = 0; j <= i; j++)
                System.out.print(word.charAt(j));

            }
            System.out.println();


        }


        for (int i = 0; i <= word.length() - 1; i++) { // when the say outer they are referring to the variable "i"
            for (int j = i; j <= word.length() - 1; j++) {
                //  System.out.print(word.charAt(j));
                if (i == 0) {
                }
                System.out.println();
            }
        }
    }
}




