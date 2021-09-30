package day_38_Methods;

public class StringUtilTest {
    public static void main(String[] args) {

        String userName = "";
if (StringUtils.isNullOrEmpty(userName)){
    System.out.println("Fail UserName cannot be null or empty");
}
        System.out.println("IsPalidrome(mom) = " + StringUtils.isPalindrome("mom"));
        System.out.println("IsPalidrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("IsPalidrome(cybertek) = " + StringUtils.isPalindrome("cybertek"));
        System.out.println("Reverse Maria = " + StringUtils.reverse("Maria"));
    }
}

