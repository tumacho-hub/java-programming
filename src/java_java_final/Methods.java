package java_java_final;

public class Methods {
    public static void main(String[] args){
        threeNumbers();
        System.out.println();
        greaterNumber();


    }

    public static void threeNumbers(){
        int numberOne = 10;
        int numberTwo = 15;
        int numberThree = 25;

        System.out.println("Total sum " + (numberOne + numberTwo + numberThree));

    }

    public static void greaterNumber(){

        int num1 = 25;
        int num2 = 15;

        if (num1 > num2){
            System.out.println("Number one is greater than number two ");
        }else{
            System.out.println("Number two is not bigger than number one");
        }
    }
}
