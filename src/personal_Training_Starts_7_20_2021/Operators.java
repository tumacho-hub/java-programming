package personal_Training_Starts_7_20_2021;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
inta = 3,  b = 2;long c = (a--+ b) * 2 / 3 % 2;
----------------------------------------------------------
Analyze each step, What is the result numOne, numTwo, and biggest?
int numOne = 10;
int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
int biggest = numOne > numTwo ? numOne : numTwo;

 */
public class Operators {
    public static void main(String[] args) {


        int numOne = 10;
       // numOne++ * 3 ==30
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;

        System.out.println(numTwo);

        int biggest = numOne > numTwo ? numOne :numTwo;
        System.out.println(biggest);

    }

}
