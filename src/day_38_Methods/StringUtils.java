package day_38_Methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\" = " + isNullOrEmpty("helloo"));
        String word = null;
   //    System.out.println(word.toUpperCase());
        System.out.println("isNullorEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullorEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.isEmpty());
//        if (str.equals(null) || str.isEmpty()){
//            return true;
//        }
//        return false;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /*
    StringUtils class:
    method: reverse
    param: String str
    return: String

StringUtilsTest:
main{
    StringUtils.reverse("java"); => "avaj"
     */
        public static String reverse (String str){
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);

            }
            return reverse;
        }
    }
