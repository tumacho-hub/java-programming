package OfficesHoursMainFolder.Practice_06_01_2021;

public class Tester {
    /*
    [Scrum Team]

* Encapsulate each class

- create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, smokeTesting(),  creatingTicket(), toString()

            -> Optional: static variable

     */
    /// instance variables below
    private String  name;        /// instance variables below
    private int employedID;
    private String  jobTitle;
    private double salary;

    public Tester(String name, int employedID,String jobTitle, double salary){
        this.name = name;
        this.employedID = employedID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }
    public void smokeTesting(){
        System.out.println(this.name + " is running a smoke rest");
    }
    public void createTicket(){
        System.out.println(this.name + " is creating a ticket");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployedID() {
        return employedID;
    }

    public void setEmployedID(int employedID) {
        this.employedID = employedID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employedID=" + employedID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
