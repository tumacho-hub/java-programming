package day_60_exceptions;

public class StringIndexIssue {
    public static void main(String[] args) {


        String word = "java";
        try {
            System.out.println("Word = " + word);
            // invalid index, code will compile but during run time,
            // exception happens
            System.out.println(word.charAt(10));
        } catch (Exception e) {
            System.out.println("Exception happened and caught");
            System.out.println("Reason = " + e.getMessage());
        /*
        * Exception STackTrace below example !
        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
	at java.lang.String.charAt(String.java:658)
	at day_60_exceptions.StringIndexIssue.main(StringIndexIssue.java:8)

         */


        }
        System.out.println(word.toUpperCase());
        String word2 = "Selenium";
        try {
            System.out.println("word2 = " + word2);
            System.out.println(word2.substring(0, 5));
            System.out.println(word2.substring(0, 15));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Type of exception: " + e.getClass().getSimpleName());
            System.out.println("Reason = " + e.getMessage());
        }
        System.out.println("----------END------------");
    }
}
