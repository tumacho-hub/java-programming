package day_51_Inheritance_Continue;

public class Contractor extends Employee {
@Override // 1) lets everyone know that you are overriding  this method
//2) ensures that this method is being overriding.  if not, shows ERROR
    public double CalculateSalary(double hourlyRate){
    return 50 * 40 * hourlyRate;

    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
