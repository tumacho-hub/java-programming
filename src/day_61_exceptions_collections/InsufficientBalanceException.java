package day_61_exceptions_collections;
/*
* custom,e exception
 */
public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){}

    public InsufficientBalanceException(String message){
        super(message);

    }
}
