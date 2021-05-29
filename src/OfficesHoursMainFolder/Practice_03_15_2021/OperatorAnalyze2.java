package OfficesHoursMainFolder.Practice_03_15_2021;
/*

Analyze the following without intellij. Calculate the output step by step
What is the value of a and b?

 */



public class OperatorAnalyze2 {
    public static void main(String[] args) {
        int a = 200; // -199
        int b = -a++ + - --a * a-- % 2 + a;
       //  -200 ++ 1 -  200  * 200       199
       //     201         -202
        System.out.println(b);

    }
}
