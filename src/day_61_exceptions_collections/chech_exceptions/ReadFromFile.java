package day_61_exceptions_collections.chech_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        // try catch handles the issue and throws just compile the code
        String filePath = "src/day_61_exceptions_collections/chech_exceptions/data.txt";
        List<String> data =  Files.readAllLines(Paths.get(filePath));
        System.out.println("First line = " + data.get(0));
        for (String line : data){
            System.out.println(line);
        }
        System.out.println("---THE END----");
    }
}
