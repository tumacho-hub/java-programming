package coquiz;
import java.sql.SQLOutput;
import java.util.Scanner;

public class day_09_scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = monthlyPay * 12;

        System.out.println(weeklyPay + "is your weekly pay.");
        System.out.println("Montly pay:" + monthlyPay);
        System.out.println("Annual pay:" + annualPay);


    }

}
