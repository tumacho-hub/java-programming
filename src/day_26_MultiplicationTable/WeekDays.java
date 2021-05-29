package day_26_MultiplicationTable;

import com.sun.javaws.IconUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WeekDays {
    public static void main(String[] args) {
        String weekdays;
      /*  for (int n = 1; n <7; n++ ){
            switch (n){
                case 1:
                    System.out.println( n + " Monday");
                    break;
                case 2:
                    System.out.println(n + " Tuesday");
                    break;
                case 3:
                    System.out.println(n + "Wednesday");
                    break;
                case 4:
                    System.out.println( n + "Thursday");

       */
         for (int day = 1; day <= 8; day++){

                 switch (day){
                     case 1 :
                         System.out.println( day + " - Monday");
                         break;
                     case 2 :
                         System.out.println( day + " - Tuesday");
                         break;
                     case 3 :
                         System.out.println( day + " - Wednesday");
                         break;
                     case 4 :
                         System.out.println( day + " - Thursday");
                         break;
                         case 5 :
                         System.out.println( day + " - Friday");
                         break;
                     case 6 :
                         System.out.println( day + " - Saturday");
                         break;
                     case 7 :
                         System.out.println( day + " - Sunday");
                         break;
                     default:
                             System.out.println("day 8 lets practice java");

                 }
             }
         }
            }




