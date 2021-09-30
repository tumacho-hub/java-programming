package last_review_9_14_21.java_interview_coding_tasks;

import BookCamp.Array;
import day_41_arraylist.ArraysAsList;

public class Array_FindMaximum {

    /*
    write a function that can find the maximum number from an int Array

    *Most of the tasks are going to ask you to write a method! what's a method?
    *Method is a behavior of the class/object and contains reusable block of code.
     */

    /*
    for example the task is asking to write a function which is almost equivalent to a method most likely a method
      how do we write a method?
      a method consist of three parts PUBLIC which is the very start of it
      Second part is the return type it could be a lot of things like "int", "String", "boolean", whatever they ask in return
      Third part is the name of it, however you want to name it, is fine just make it clever related to the subject
      Fourth part is a most you have to declare what you want in return ()inside the parenthesis!
      Fifth part which is most important dont forget the return and return most have a similar name as the method itself.

      so in total a method consist of five parts which are:
        public
            int, String etc
                method=>name
                    (declaration of value and return type)


     */

    //write a function that can find the maximum number from an int Array

    public int maxValue(int[] n) { // <-- my method is created

        int max = Integer.MIN_VALUE; // then we have to declare our variable in this case is Integer because is an Array

        for (int each : n){ // then we create  each loop because it is going to alternate  through each number
            if(each > max){ // our if condition is going to compare the values and going to throw the highest value in this case
                max = each; // last statement we are switching the values
            }
        }
    return max;
    }

    public int minimumValue(int[] m){
        int minimum = Integer.MAX_VALUE;

        for (int each : m){
            if (each < minimum){
                minimum = each;

            }

        }
        return minimum;
    }

}

