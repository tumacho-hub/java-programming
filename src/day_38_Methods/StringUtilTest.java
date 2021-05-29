package day_38_Methods;
import static day_38_Methods.StringUtils.*;
public class StringUtilTest {
    public static void main(String[] args) {

        String userName = "";
if (StringUtils.isNullOrEmpty(userName)){
    System.out.println("Fail UserName cannot be null or empty");
}
        System.out.println("IsPalidrome(mom) = " + StringUtils.isPalidrome("mom"));
        System.out.println("IsPalidrome(kayak) = " + StringUtils.isPalidrome("kayak"));
        System.out.println("IsPalidrome(cybertek) = " + StringUtils.isPalidrome("cybertek"));
        System.out.println("Reverse Maria = " + StringUtils.reverse("Maria"));
    }
}

