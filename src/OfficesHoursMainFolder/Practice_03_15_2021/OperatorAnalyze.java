package OfficesHoursMainFolder.Practice_03_15_2021;
/*
[Operators]

Analyze the following without intellij. Calculate the output step by step

    int a = 5; // 5
    int b = a++ + a-- + a * 2 + a + ++a; //  5,4,10,6

What is the value of a and b?

====================================================

[Operators]

Analyze the following without intellij. Calculate the output step by step

    int a = 200;
    int b = -a++ + - --a * a-- % 2 + a;

What is the value of a and b?

====================================================

[Operators]

Analyze the following without intellij. Calculate the output step by step

int x = 300;
int y = 400;
int z = x + y - x * y + x / y;

What is the value of x, y, and z?
 */
public class OperatorAnalyze {
    public static void main(String[] args) {

        int a = 5; // 5
        int b = a++ + a-- + a * 2 + a + ++a;
        System.out.println("a - " + b );

    }
}
