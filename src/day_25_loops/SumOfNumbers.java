package day_25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++  ) {
            System.out.println(i);
            sum+= i; //= 5 // sum+= this variable will add the numbers while the loop runs and store on sum variable

        }
        System.out.println("sum = " + sum);
    }

}
