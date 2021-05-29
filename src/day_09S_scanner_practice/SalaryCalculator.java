package day_09S_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args) {
        // enter hourly rate 50, 40 hours of work in a week
        //we need to calculate: weeklyPay, monthlyPay,annualPay
        //print all three in 3 lines

       // Scanner scan = new Scanner (System.in);
       // int hourlyRate = 50;
       // int weeklyHours = 40;
// this is an example of regular coding without scanner
        System.out.println("Enter hourly rate:");
        double hourlyRate = 50.5; // we calculating so we use double
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12;//weeklypay * 4 "might not be accurate!
        double annualPay  = monthlyPay * 12;

        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("Monthly pay: " + monthlyPay);
        System.out.println("Annual pay: " + annualPay);





    }
}
