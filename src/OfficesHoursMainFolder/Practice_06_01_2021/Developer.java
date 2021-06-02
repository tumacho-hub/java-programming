package OfficesHoursMainFolder.Practice_06_01_2021;

public class Developer {
    /*
     - create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        hasCodingSkills

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, coding(),  fixingBug(), toString()

     */
    private String name;
    private int employedID;
    private String jobTitle;
    private double salary;
    private  static boolean hasCodingSkills = true;
    // static belongs to the class not to the instance variables // static does not belong to the object belongs to the class!!
    // static also means is fix
public Developer(String name, int employedID, String jobTitle, double salary){


    this.name = name;
    this.employedID = employedID;
    this.jobTitle = jobTitle;
    this.salary = salary;

}
public void coding(){
    System.out.println(this.name + " this coding");
}
public void fixingBug(){
    System.out.println(this.name + " is creating a ticket");
}

    public String getName() {
        return name;
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

    public boolean hasCodingSkills() {
        return hasCodingSkills;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employedID=" + employedID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

