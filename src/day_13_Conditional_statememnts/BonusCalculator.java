package day_13_Conditional_statememnts;

public class BonusCalculator {
    public static void main(String[] args) {
                 double bonus = 0.0;
                 double salesAmount  = 2000.35;
                 if (salesAmount >= 2000) {
                     System.out.println("good job, you qualified for bonus!");
                     bonus = 50.0; // conditional vale assignment
                 } else {
                     System.out.println("great job, you are qualified for full bonus");
                     bonus = 100.0;
                 }
        System.out.println("your total bonus : $ " + bonus);


    }
}
