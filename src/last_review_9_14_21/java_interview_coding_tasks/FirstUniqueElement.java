package last_review_9_14_21.java_interview_coding_tasks;

public class FirstUniqueElement {
   /*
    write a program that can find the first duplicated element from the array
    */

    public int firstDuplicateElement(int[] array) { // <-- our method
        int firstDuplicate = 0;// this variable is going to store our value once is being found and will return it

        for (int each : array) {  // once again this each loop is going through each value of the array
            int element = 0; // this variable is going to hold my first element -> number -> value etc.
            for (int each2 : array) { // my inner each loop is going through the second value of the array because we need to find the duplicate which is second value
                if (each == each2) {// my if statement is going to compare each value if they are equals is going to store them in our variable
                    element++; // this variable is going to keep track of how many times the elements repeats itself and store it outside our loops
                }
                if (element > 1) { // in this if statement we are stating that we need to check for more than one element for example if is more than one then we need to check it out
                    //and store in the first duplicate variable
                    firstDuplicate = each;
                    break;

                }

            }

        }
        return firstDuplicate;
    }
}

