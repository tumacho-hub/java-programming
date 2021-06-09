package day_51_Inheritance_Continue;

import java.util.concurrent.Callable;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle ="Java developer";
        System.out.println("developer.CalculateSalary(55.0) = " + Math.round(developer.CalculateSalary(55.0)));
        double annualDevSalary = developer.CalculateSalary(55);
        System.out.println("annualDevSalary = " +Math.round(annualDevSalary));

      Contractor sdetContractor = new Contractor();
      sdetContractor.jobTitle = "SDET";
     double sdetSalary = sdetContractor.CalculateSalary(55);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(developer);
        System.out.println(sdetContractor);


    }
}

