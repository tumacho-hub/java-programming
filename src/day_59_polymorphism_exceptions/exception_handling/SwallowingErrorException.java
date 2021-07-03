package day_59_polymorphism_exceptions.exception_handling;

public class SwallowingErrorException {
    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            System.out.println(5/0);

        }catch (Exception ignore){
            System.out.println("how are you today?");
            System.out.println("We just suppressed / swallowed the Runtime Exception");
            System.out.println("error is not reported, we just ignore it");
        }
    }
}
