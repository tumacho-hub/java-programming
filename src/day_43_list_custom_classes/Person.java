package day_43_list_custom_classes;

import practice_03__02_2021.PersonInfo;

public class Person {
// Data -> variables for now then it will change , no behavior for now then wil add
    String firstName;
    int age;
    char gender;
    // behavior of the person
    public void speak(){
        System.out.println("person is speaking");
    }
// example above is one class or temple
}

class People {
    // example below its the example of INSTANTIATE Person class
    // we can use this values and also print them
    public static void main(String [] args){
        Person person1 = new Person();

        person1.firstName = "Bob"; //data
        person1.age = 33;// data
        person1.gender = 'M';//data
        person1.speak();/// behavior it prints first because we are not printing

        System.out.println(person1.firstName );
        System.out.println(person1.age);
        System.out.println("person1.gender = " + person1.gender);

        System.out.println("-------------------------------------------------------");

        Person person2 = new Person();
        person2.firstName = "Maria";
        person2.age = 33;
        person2.gender = 'F';
        person2.speak();
        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println("person2.gender = " + person2.gender);


    }
}