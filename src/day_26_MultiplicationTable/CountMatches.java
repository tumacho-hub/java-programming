package day_26_MultiplicationTable;

public class CountMatches {
    public static void main(String[] args) {
        // example of three variables at once with loop
        String word = "Maria ";
        char letter = 'a';
        int count = 0;

        for ( int i =0; i < word.length(); i++ ) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("there are " + count + " " + letter + " in " + word);
    }
}
