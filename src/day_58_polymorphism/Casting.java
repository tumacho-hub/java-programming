package day_58_polymorphism;

public class Casting {
    public static void main(String[] args) {
// variable of worker and object of superman
        Worker worker = new SuperMan();  // object of superman!!
        worker.work("QA Manager"); // variable of superman!
        worker.getPaid();// variable of superman!

         //  worker.raiseKid();ERROR this wont work but we can cast and make it work !
        // example of casting!!
        ((Father)worker).raiseKid(); // this is the casting way
        ((SuperMan)worker).playWithKid(); // this is casting!

        SuperMan superMan = (SuperMan) worker; // this an example of downCasting from worker to superman
        superMan.work("Java dev");
    }
}
