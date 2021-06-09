package day_51_Inheritance_Continue;

public class Employee extends Object{

    String jobTitle;
   public double CalculateSalary(double hourlyRate){
       return 52 * 40 * hourlyRate * 1.1;


   }
// to string method is inherited from Objects class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
