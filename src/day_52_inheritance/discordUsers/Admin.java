package day_52_inheritance.discordUsers;

public class Admin extends User {
    public Admin(){
        super();// call super class / user class no - args constructor // super class constructor
        System.out.println("Admin class constructor");


    }
public Admin(String name , int id){
super("Admin",name, id);
    System.out.println("Admin class 2 args constructor");
}
    @Override
    public String toString(){
        return "User{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", ID=" + getID() +
                '}';
    }
}
