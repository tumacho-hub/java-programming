package day_27_java_Loops;

public class ReadStringPortion {
    public static void main(String[] args) {
         String list = "cat,car,cat,red_car,java,selenium";

        System.out.println(list.substring(0,3));
        System.out.println(list.substring(1,4));
        System.out.println(list.substring(2,4));
        System.out.println(list.substring(3,6));
        System.out.println(list.substring(4,7));
        System.out.println("-----------------------------");
        for (int i=0; i<list.length()-2; i++ )
            System.out.println(list.substring(i, i+3));

         }


    }

