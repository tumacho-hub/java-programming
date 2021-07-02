package day_58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {

        Father spMan1 = new SuperMan();// below we have object from father
        spMan1.playWithKid();// Father class methods that were inherited to Superman
        spMan1.feedKid();
        spMan1.raiseKid();
    //    spMan1.work ERROR spman1 is father type can only access methods in father
        // example below SUPERMAN IS NOW WORKER
        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");// work(job) method is from Worker interface so spMan2 has access
        System.out.println("got paid $" + spMan2.getPaid() );
       // spMan2.raisekid ERROR // raisekid from father wont work

        // below superman is superman that means it does inherited all variables and object hang over the object!
        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("Scrum Master");
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();




    }
}
