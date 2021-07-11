package day_61_exceptions_collections;

public class BeakTimeException extends RuntimeException{
    public BeakTimeException() {
    }

    public BeakTimeException(String message) {
        super(message);// calling parent constructor
    }


}
