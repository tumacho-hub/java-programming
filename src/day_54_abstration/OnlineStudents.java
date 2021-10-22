package day_54_abstration;
// Online student class will extend Student abstract class
// a class only have " public class{ "
// this class is considered to be concrete class is same as abstract class
//it is responsible to implement all abstract methods ( if any)

public class OnlineStudents extends Student {
// attendClass abstract method id implementing by the sub class
// subClass is overriding the abstract method of parent
    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using zoom");
    }
  //  public abstract void askQuestion(); Error  abstract method cannot be in normal class
}
