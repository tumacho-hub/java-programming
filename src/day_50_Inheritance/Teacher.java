package day_50_Inheritance;

/*
sub class
parent class
devired class
 */
public class Teacher extends Person{
    int teacherID;

    public void teach(String topic){
        System.out.println("Teacher is teaching " + topic);

    }
}
