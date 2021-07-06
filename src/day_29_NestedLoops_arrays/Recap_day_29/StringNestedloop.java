package day_29_NestedLoops_arrays.Recap_day_29;

public class StringNestedloop {
    public static void main(String[] args) {
        /*
        using the same approach i can solve
         *find and duplicates and count
         *find unique characters (appearing only once)
         *print character and number of occurrences

         */
        //             0123
        String word = "Java";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                //     System.out.println(i); // this will only will only give me the length of the word!
                System.out.print(word.charAt(j)); // CHARTAT is always  referring to characters in the word!!

            }
            System.out.println();

            for (int outer = 0; outer < word.length(); outer++) {
// for the example below our starting piont is the outer loop because we need to start from where the outer loop starts
// mot zero!!
                for (int inner = outer; inner < word.length(); inner++) {
                    System.out.print(word.charAt(inner));
                }
                System.out.println();

                String word1 = "jorges";
                for (int outer1 = 0; outer1 <= word1.length() - 1; outer1++) {
                    for (int inner = outer1; inner <= word1.length() - 1; inner++) {
                        System.out.print(word1.charAt(inner));
                    }
                    System.out.println();

                }
            }


        }
    }

}


