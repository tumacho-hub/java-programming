package day_43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
  /*
  add 3 objects of
   */
        // add 3 objects of Employee class
        Employee emp1 =  new Employee(); //first step on how to pull the class
        emp1.name = " Jorge Flores"; // variable from previous method
        emp1.jobTitle = "SDET";// variable from previous method
        emp1.work();

        Employee emp2 =  new Employee();
        emp2.name =" Maria Lazaro";
        emp2.jobTitle = "Police officer";
        emp2.work();



    }
}
