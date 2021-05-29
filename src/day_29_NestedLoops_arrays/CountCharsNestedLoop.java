package day_29_NestedLoops_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        String word2 = "chartat";
        // outer loop --> 0 to length
        for (int outer = 0; outer <= word.length()-1; outer++) { // outer loop is ready

          //  System.out.println("outer : " + word.charAt( outer));

            int count = 0; // we add a new variable inside the

            for (int inner = 0; inner <= word.length()-1; inner++){

                if (word.charAt(outer) == word.charAt(inner) ){
                    count++;
                }


            }
               System.out.println(word.charAt(outer) + "=" + count);
        }
        for (int outer = 0; outer <= word2.length()-1; outer++){ // my first outer is set to start the count
           int count = 0; // we need this new variable because is going to reset the count and start from 0 very important

            for (int inner = 0; inner <= word2.length()-1; inner++){ // inner loop is ready to count

                // chartAt is checking the indexes of STRING WORD!
                if(word2.charAt(outer) ==  word2.charAt(inner)){ // if condition is going to check if the character match!
                    count++; //  count will keep keep tract of the letters that repeat and add !!
                }
            }

            System.out.println(word2.charAt(outer) + "=" + count);
        }
    }


}
