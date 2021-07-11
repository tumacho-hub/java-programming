package day_61_exceptions_collections.chech_exceptions;

public class CheckExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");
        /*
        * Thread.sleep(1000); causes an InterruptedException,
        * which is a checked exception.
        * W e are handling it below
         */
        try {
            Thread.sleep(1000);

            System.out.println("Woke up after 5 minutes");
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
        /*
        Declaring using Throws keyword
         */
         Thread.sleep(5000);
        System.out.println("Woke up after 5 minutes");
    }
}
