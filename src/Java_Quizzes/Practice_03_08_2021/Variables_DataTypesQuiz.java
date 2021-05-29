package Java_Quizzes.Practice_03_08_2021;

import day01_intro_to_programming.Aboutme;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.*;


public class Variables_DataTypesQuiz {
    public static void main(String[] args) {

        /*String[] things = {"house","shed","slide","zebra","park", "garden"};

        for (String s: things){
            switch (s.charAt(1)){
                case 'h':
                    System.out.println(1);
                    break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);
                case 'p':
                    System.out.println(5);
                    break;
                case 'z':
                    System.out.println(6);
                case 'l':
                    break;
                case 'g':
                    System.out.println(7);

         */
            }

        }
        /*int a = strs.length;
        int b = strs[5].length();
        System.out.println(a+  " " + b);

         */

        /*String [] other = new String[words.length];



        for (int i =0; i< words.length; i++){
            other [i] = words[i + words[i].length()];
        }
            System.out.println(Arrays.toString(other));

         */


       /* double [] doub = new double[4];
        doub[0] = 1.0;
        doub[2] = 42.1;
        doub = new double[4];
        doub[1] = 17.2;
        doub[3] = doub.length;
        System.out.println(Arrays.toString(doub));

        */
       /* String str = "today it will be 100 degrees !";
        int n = 0;
        while (n++ < str.length()){
            if (n == 8){
                continue;
            }else if (n ==9){
                break;
            }
            System.out.println(str.charAt(++n));
        }

        */
/*Scanner input = new Scanner(System.in);
int num1 = input.nextInt();
        int num2 = input.nextInt();
        int iterate = input.nextInt();

        int total=0;

       for ( int j=0; j < iterate ; j++){
           if (j %3 == 0) continue;
           total += num1+num2;

       }
        System.out.println(total);

 */
         //   System.out.println(str.charAt(i));

        /*String w = "java";
        int a=0;
        do {
            System.out.println(w.charAt(a));
            a++;
        }while (a > w.length());

         */

       /* int n =5;
        while (n<100){
            n += n;
        }
        System.out.println(n);

        */
        /*String s =  "java is fun";
        char c = s.charAt(4);


        if (c== 'a') {
            System.out.println("a");

        }else if (c == ''){
                System.out.println("b");
        }else{
            System.out.println("first and last letters mismatch");

        }

         */
       // String a = "java is fun";
       // String result = 3425 >(9*100) ? "garden" : "patio";
        //result.substring(2);
       // System.out.println(result);
        //String b = 5+4+a;
        //System.out.println(b);
       /* String word = "github";
        System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("u"));
        System.out.println(word.indexOf("hub"));
        System.out.println(word.indexOf("java"));
        int num = 11;
        if (num++ == 11) {
            System.out.println("he" + num);
        } else {
            System.out.println("ghkd");
        }

        */
       /* for (int i = 0;     i < 10;    i++) {
            if (i % 2== 0){
                continue;
            }
            System.out.println(i);
        }

        */
        /*for (int i = 1; i < 10; i++) {
            System.out.println(i);

         */


        /*String[] items = {"Shoes", "Jackets", "gloves", "Airpods", "iPad", "iphone case"};
        double[] prices = {99.99, 150, 9.99, 250.0, 439.50, 36.99};
        int[] itemsIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemsIDs));

        double maxPrice = prices[0]; // assume first price is max
        int indexOfMaxPrice = 0; // assume max price is at index 0

        for (int i = 0; i < prices.length; i++) {
            //  System.out.println(prices[i]);
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;

            }

        }
        System.out.println("max price " + maxPrice + "\n"+ "index of max prices =" + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + "-$" + prices[indexOfMaxPrice] + " -# "+ itemsIDs[indexOfMaxPrice]);

         */



