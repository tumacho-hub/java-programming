package day_56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage mountainLanguage = new MountainLanguage();
        mountainLanguage.hi();
        mountainLanguage.bye();

        Greeting greeting = new MountainLanguage();

        greeting.hi();
        greeting.bye();

        Japanese japanese = new Japanese();
        japanese.hi();
        japanese.bye();




    }
}
