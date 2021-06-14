package day_53_inheritance.final_keyword;
/*
 TestData class that has a list of constants
 values of the below variables can not be changed anywhere
 final methods usually have uppercase because is convention
 classes always always start with uppercases. packages always always all lowerCase
 */
public final class TestData {
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;
}

     /*
     ERROR: Cannot inherit from final class
      class Child extends TestData{
      */




