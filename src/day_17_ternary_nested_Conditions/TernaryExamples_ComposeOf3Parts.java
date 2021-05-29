package day_17_ternary_nested_Conditions;
import java.util.*;
public class TernaryExamples_ComposeOf3Parts {
    public static void main(String[] args) {
        int score1 =  75;
        String result;
        if (score1 > 60){
            result = "pass";
        }else{
            result = "failed";
        }
        System.out.println("result = " + result);
        int score = 88;
        // if score more than 60  give me 5 otherwise
        String result1 = (score > 60) ? "pass" : "fail";
        System.out.println("result1 = " + result);
    }
Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    String resutl2 = (x >=5) ? "x" : "-x";

    String result3 = (x < 5) ? "-x" : "x";


}
//Display x ---if x is greater than or equal to 5
// Display -x ---if x is less than 5 (flip sign - negative/positive



