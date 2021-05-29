package day_27_java_Loops;

public class IndexOff {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'h';
        int index = -1;

        for ( int n = 0; n < word.length(); n++ ) {
            //System.out.println(n + " - " + word.charAt(n));
             if (word.charAt(n) == letter) {
                 index = n;
                 System.out.println(letter + " is found at index" + index);
                  break;  // return vs  break!! use break becuase it will stop the code and break will kick it out the code !!
             }
        }
        if (index == -1 ) {
            System.out.println(letter + " is not present");
        }
    }
}
