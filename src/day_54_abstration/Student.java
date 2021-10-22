package day_54_abstration;
// we add abstract keyword to a class to make it an abstract class.
//  we can not create object of student class  meaning
//  Student student = new Student(); will show error
// what can we do with this student class? we can extend this class by sub class
// student class will be parent class for all other types of student related classes
public abstract class Student {

    public void code(String language){
        // we can provide implementation because is not abstract
        System.out.println("Student is coding using " + language);


    }
    /*
    we can add abstract methods into abstract class
    abstract method is created using abstract keyword
    and does not have the implementation body
    so abstract class
     */
    public abstract void attendClass();

    }


