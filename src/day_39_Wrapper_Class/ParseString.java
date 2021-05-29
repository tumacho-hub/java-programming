package day_39_Wrapper_Class;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(count);

        String srtPrice = "123.99";

        double price = Double.parseDouble(srtPrice);
        if (price > 100) {
            System.out.println("expensive ");
        }




        String sentence = "I wrote 100 lines of code";
        // split by space,parse index2 to int
        String[] words = sentence.split(" ");

        int linesOfCode = Integer.parseInt(words[2]);

        System.out.println("linesOfCode = " + linesOfCode);


    }
}

