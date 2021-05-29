package day_37_methods_overloading;
/*
add new method:
    repeatString

params:
    String word, int times, char delimiter

it builds the string and returns

repeatString("java", 3, '|');
    => "java|java|java"

repeatString("hi", 5, '~');
    => "hi~hi~hi~hi~hi"
 */
public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi", 3, '|'));
        System.out.println();

        System.out.print(repeatString("\nI can do it!", 10, '-'));

    }

    // DELIMITER = something in the middle.
    public static String repeatString(String word, int times, char delimiter) {
        String retValue = "";

        for (int i = 1; i <= times; i++) {

            if (i == times) { // if last iteration
                retValue += word; // add only word by itself

            } else {
                retValue += word + delimiter; // add with delimiter
            }

        }
        return retValue;

    }
}




