package day_39_Wrapper_Class;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));

        System.out.println(Integer.sum(50,35));

        System.out.println(Integer.min(5,2));

        System.out.println("Minimum Integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum Integer: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4, 23.9));
        System.out.println("Min Double: " + Double.MIN_VALUE );
        System.out.println("Max Double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5, 5));
        System.out.println(Double.compare(5, 45));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('V'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isUpperCase('r'));
        System.out.println(Character.isLetter(9));
        char letter = 'A';
        if ( Character.isUpperCase(letter)){
            System.out.println("It is uppercase");

        }
        String word = "JaVa iS FuN";
        for (int i =0; i< word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE.equals(5>3));

        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println();

        String srtPrice = "123.99";
        double price = Double.parseDouble(srtPrice);

        int num = Integer.parseInt("55");

    }
}
