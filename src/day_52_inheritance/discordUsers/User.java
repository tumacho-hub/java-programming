package day_52_inheritance.discordUsers;

public class User {
    private String role;
    private String name;
    private double ID;

    public User(String role, String name, double ID) {
        System.out.println("User class 3 args constructor");
        this.role = role;
        this.name = name;
        this.ID = ID;
    }

    public User(){
        System.out.println("User class constructor");
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }
}
