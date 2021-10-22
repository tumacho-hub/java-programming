package java_java_final;

import java.io.*;
import java.util.*;
public class file_reader {

    /*
    this how we read from files without any external libraries in java
    we use the following class
    FIle reader class
     */
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("text.file"); // to be able to read from existing file make sure to pass the path content path!!
        BufferedReader read =  new BufferedReader(fileReader);
        System.out.println(read.readLine());
        System.out.println(read.readLine());

        FileWriter fileWriter = new FileWriter("text.file");
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("Let's party bitches!");
        writer.write("\nQue no paren la fiesta!");
        writer.close();


    }
}
