package day_19_Class_vs_Object_String;

public class lenthOfTheString {
    public static void main(String[] args) {
        /* length () method in string class. returns the count of characters inn the string.

      */
        String word = "java";
        System.out.println(word);
        System.out.println( word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());
        String firstName ="jorge";
        System.out.println(firstName + "-" + firstName.length());
        // when you use method, you calling a method
        int count = firstName.length();
        System.out.println("count = " + count);


        String password = "1234";
        if (password.length() >= 6 ) {
            System.out.println("valid amazon password");
        }else {
            System.out.println("password must be at least 6 characters");

            String countryCode = "usa";
            if (countryCode.equals(countryCode.toUpperCase())) {
                System.out.println(countryCode );
            }


        }




    }
}
