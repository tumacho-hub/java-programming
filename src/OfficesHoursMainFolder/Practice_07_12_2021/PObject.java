package OfficesHoursMainFolder.Practice_07_12_2021;

public class PObject {
    public static void main(String[] args) {
/*
* we are able to create two objects of a one class
 */
        PA obj1 = new PA(); // this are two objects we just created
        Object obj2 = new PA(); //this are two objects we just created
        obj1.go();
        ((PA)obj2).go();

        PB obj3 = new PC();
        obj3.go();

        ((PC)obj3).math();
        ((PI)obj3).math();

        PB obj4 = new PB();
        obj4.go();
        ((PA)obj4).go();
        ((PI)obj4).math();

    }
}
