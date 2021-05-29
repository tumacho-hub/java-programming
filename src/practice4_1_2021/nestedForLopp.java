package practice4_1_2021;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class nestedForLopp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int underscore = email.indexOf("_");
        int atSignIndex = email.indexOf("@");
        String name = email.substring(0, underscore );
        String lastN = email.substring(underscore+1, atSignIndex);

if (!email.contains("_")){
    System.out.println(email);
}else if (email.contains("_")) {
    System.out.println(lastN + "_" + name + "@gmail.com");

        }


    }

}
