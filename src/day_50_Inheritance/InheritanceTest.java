package day_50_Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Jorge";
        p1.age = 34;

        p1.talk();
        p1.walk();
        p1.work("SDET");


        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "MUrodil";
        t1.age = 30;
        t1.walk();
        t1.teach("Java inheritance");

   Student student =  new Student();
   student.name = "Maria";
   student.age = 34;
   student.walk();
   student.talk();
        student.work("java programing");
        student.school = "CYbertekSchool";
        student.study("Java programing inheritance");

    }
}
