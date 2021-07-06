package day_30_arrays.recap_Array;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = {"JF123", "Jorge", "Flores", "B4321", "123-456-7890"};

        String[] student2 = {"ML321", "Maria", "Lazaro", "B1234", "123-321-4123"};

        System.out.println("Student id: " + student1[0]);
        System.out.println("Student Name: " + student1[1]);
        System.out.println("Student LastName: " + student1[2]);
        System.out.println("Student Batch: " + student1[3]);
        System.out.println("Student Phone number: " + student1[4]);
        System.out.println(student1.length);


        if (student1.length == 5) {
            System.out.println("Pass: data Array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("Pass: data Array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }
        System.out.println(student1[1].toUpperCase(Locale.ROOT) + " " + (student1[2].toUpperCase(Locale.ROOT)));

    }
}

