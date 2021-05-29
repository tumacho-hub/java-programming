package day_30_arrays;



public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        String[] student2 = {"Mk4421", "mike", "Bloomberg", "B22", "703-432-1234 " };

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);
        System.out.println("student data length: " + student1.length); // we get 5 because length start with one not like index! index start with 0!
        // check if student1 data contains 5 items.
        if (student1.length == 5) {
            System.out.println("data array has correct length");
        } else {
            System.out.println("Fail: data incorrect");
        }
        // if student1 and student2 arrays have same number of data..
        if (student1.length == student2.length){
            System.out.println("PASS: data arrays has correct length ");
        }else {
            System.out.println( "FAIL: data arrays has incorrect length ");
        }

       // System.out.println(student1[1].toUpperCase() +", " + student1[2].toUpperCase());
        System.out.println((student1[1] +", " + student1[2]).toUpperCase());

       String mobileNum= student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));


    }
}
