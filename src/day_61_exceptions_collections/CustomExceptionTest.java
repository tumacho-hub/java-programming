package day_61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes = 30;

        System.out.println("CLass is going on for 60 minutes");
        if (minutes > 50) {
            throw new BeakTimeException("It is break time!");

        }
        System.out.println("let's continue the class");
         double balance = 400;
         double itemPrice = 500;
        System.out.println("I have $" + balance +" and purchasing item for $" + itemPrice);
        if (itemPrice > balance) {
            throw new InsufficientBalanceException("Transaction declined. Not enough funds :(");
        }

        System.out.println("Item successfully purchased");

         }

    }



