package day_24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: world's smallest cat \ud83d\udc08 - bbc");
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("watching \ud83d\udc08 at second" + seconds);
            seconds++;
            Thread.sleep(10000); // Thread.sleep (1000) PAUSE the code for a 1000 milliseconds.(1 second).
        }
        System.out.println("finish watching the \ud83d\udc08 ");
        System.out.println("lets start another one");

    }
}
