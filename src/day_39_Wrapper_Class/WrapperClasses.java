package day_39_Wrapper_Class;

import java.util.concurrent.Callable;

public class WrapperClasses {
    public static void main(String[] args) {
         int num = 100;
         num += 10;
        System.out.println(num);
         ////// one way of doing wrappers
        Integer n = new Integer(500);  /// first way to create an INTEGER
        System.out.println("is n 500? = " + n.equals(500));
        System.out.println(n + 300);


        Integer n2 = 1000;
        System.out.println(n2 / 50);

        String numstr = n2 + "";
        String numst = n2.toString();

        System.out.println("numstr = "+ numstr);
        System.out.println("numstr2 = " + numstr);
     ////  DECLARING  AND INITIALIZATION  FOR WRAPPER

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;

        Short sh1 = new Short((short) 40);
        Short  sh2 = 50;

        Integer i1 = new Integer(100);
        Integer i2 =  200;

        Long l1 = new Long(300);
        Long l2 = 3455L;

        Float fl1 = new Float(5.2f);
        Float fl2 = 45.3f;

        Double d1 = new Double(345.3);
        Double d2 = 234.5;

        Character ch1 =  new Character('Q');
        Character ch2 = 'V';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;

     // int n = 50 ;      >>>>
     // Integer n2 = n;   >>>>  this will not work because its already declared

      // n is primitive
        // n2 is wrapper class object when we assigned to
        // n to n2, we did AUTO-BOXING - converting from
       // primitive into wrapper class object

        // UNBOXING :  converting wrapper class object >> primitive
        /// Integer n1 = new Integer(432);
        // int n2 = n1;

            }
        }



