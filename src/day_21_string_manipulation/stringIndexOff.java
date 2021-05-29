package day_21_string_manipulation;

public class stringIndexOff {
    public static void main(String[] args) {
        //              012345
        String word = "github";
        System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("u"));
        System.out.println(word.indexOf("hub"));
        System.out.println(word.indexOf("java"));
        int num = 11;
        if (num++ == 11) {
            System.out.println("he" + num);
        } else {
            System.out.println("ghkd");
        }
    }
}
