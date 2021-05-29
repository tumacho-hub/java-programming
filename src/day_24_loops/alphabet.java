package day_24_loops;

public class alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;

        }
        System.out.println("reverse alphabet");

        char letter1 = 'z';
        while (letter1 >= 'a') {
            System.out.print(letter1 + " ");
            letter1--;
        }
    }
}
