package OfficesHoursMainFolder.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {
        // when thinking about casting thing in this order
        // byte -> short -> int -> long -> float -> double ->
         byte b = 10;
         short s = b;
         byte b2 = (byte)s;

         double d = 5.3;
         int i = (short)d;
         int i2 = (int)d;
        System.out.println((i));// 5
        System.out.println((double) i); // 5.0

         float f = 3.54f;
         float f2 = (float)3.54;

         float f3 = 5; // float = int   -> 5.0
        float f4 = 5.5f; // float = double
        long l = 22313;
        long l2 = 312312313232L;
     //   long l3= (long)312312313232; -> it will never work because number id too big for int!!
        System.out.println(l);
        System.out.println((double)l);
        System.out.println(l2);

        double million =  1_000_000;
        System.out.println(million);

    }
}
