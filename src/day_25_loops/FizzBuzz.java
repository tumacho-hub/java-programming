package day_25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {

            if (i % 3 == 0 && i % 5 == 0 ){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0) {
                System.out.println("FIzz");
            }else if ( i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
