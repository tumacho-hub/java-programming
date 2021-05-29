package day05_Primitives;

public class UsingVariables {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 200;
        System.out.println(num1);//200
        System.out.println(num2);//100

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;

        /* n1->55
             n2->55
             n3->55
         */

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inthiresZipCode = 22182;
        int paryinsZipCode = inthiresZipCode;
         System.out.println(inthiresZipCode);
         System.out.println(paryinsZipCode);

        inthiresZipCode = 20007;
        paryinsZipCode = 33131;
        System.out.println(inthiresZipCode);
        System.out.println(paryinsZipCode);

    }
}
