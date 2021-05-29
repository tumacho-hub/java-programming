package day_22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
                //       012345678910
        String result = "result count:12345";
        System.out.println(result.substring(13,18));
        System.out.println(result.substring(13));
        // find the index of:
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex));
        System.out.println(result.substring(colonIndex + 1));

        // now we can combine them into 1 statement
        System.out.println(result.substring(result.indexOf(":")));
        String  today = "i learned [java] today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1, end));
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));

    }
}
