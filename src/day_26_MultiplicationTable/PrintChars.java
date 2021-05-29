package day_26_MultiplicationTable;

public class PrintChars {
    public static void main(String[] args) {
        String word = "jorge";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " " + i);
        }
        System.out.println();
        for (int j = word.length() - 1; j >= 0; j--) {
            System.out.println(j + " " + word.charAt(j));
        }


    }
}

