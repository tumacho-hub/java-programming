package day_21_string_manipulation;

public class firstAndLastTest {
    public static void main(String[] args) {
        String  word =  "MOM ";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if (first == last){
            System.out.println("first and last letters match");
        }else{
            System.out.println("first and last letters mismatch");

        }
        if (word.charAt(0) == word.charAt(2)) {
            System.out.println("first and last letters match");
        }else{
            System.out.println("first last letters mismatch");
        }
        String friend = "ilhom";
        char firstLetter = friend.charAt(0);
        int count = friend.length();
        char lastLetter = friend.charAt(friend.length() -1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (friend.charAt(0) == friend.charAt(4)) {
            System.out.println(friend + "- first and last match");
        }else {
            System.out.println(friend + "- first and last match");
        }
    }
}
