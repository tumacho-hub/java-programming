package TEST;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class officehours_review {
    public static void main(String[] args) {
        System.out.println(removeDuplicateChars("AAABBBCCCD"));

    }

    public static String removeDuplicateChars(String str) {

        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        return  set.toString();


    }

    }

