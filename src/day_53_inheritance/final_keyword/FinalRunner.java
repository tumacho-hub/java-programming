package day_53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
    //    TestData.ADMIN_USERNAME = "change"; ERROR==> cannot change value of final variable

        final  int SSN =  421325466;
        // also  SSN =  421325466; ERROR variable also final



    }
}
