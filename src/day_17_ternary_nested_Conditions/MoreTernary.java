package day_17_ternary_nested_Conditions;

public class MoreTernary {
    private static boolean True;

    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply;
        if (hourlyRate > 45) {
            reply = "accept";
        } else {
            reply = "reject";
        }
        String reply1 = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply1 = " + reply1);







        String todayClass = "java";
        String teacher1 = "Murodil";
        String teacher2 = "";
     //   String todayClass1= "java";
        String teacher = (todayClass.equals("Java")) ? "saim | murodil" : "nadir";
        System.out.println("today's teacher = " + teacher);

        boolean isEligibleToDrive = True;
        //String driving; //"have DL, can drive 
        String driving = isEligibleToDrive ? "yes, have dl, " : "no DL, cannot drive";
    }
}

