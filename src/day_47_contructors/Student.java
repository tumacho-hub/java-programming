package day_47_contructors;

public class Student {

    private String name;
    private int age;

    // no_args constructor
    public Student(){
        System.out.println("no_args constructor");


    }
    //constructor overloading with 1 param: String name

    public Student(String name){
        System.out.println("name param constructor "+name);

    }
    //constructor with age
    public Student(int age){
        System.out.println("age param constructor = " + age);
    }
    //constructor with name and age
    public Student( String name, int age){
        System.out.println("name&age param constructor =  = " + name +  age);
    }

}
