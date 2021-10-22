package day_54_abstration;

public abstract class MyAbstractClass {
    int num = 55;
    public void learn(){
        System.out.println("Learning...");
    }



public abstract void close();  // <-- abstract method with no implementation, just signature. it only shows what class can do but not how.

}
 class Sub extends MyAbstractClass{
    //  it showing an error because sub class must implement/ override
    // override rule means same name same parameters

     public void close(){ // this is the implementation body the hows!!
         System.out.println("Close-Abstract method implementation");

     }


 }

class MyObjects{
    public static void main(String[] args) {

      //  MyAbstractClass myAbstractClass = new MyAbstractClass() {
            Sub sub = new Sub();
            sub.learn();
        System.out.println(sub.num);
        sub.close();



        }
    }

