package day_60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {

        System.out.println("Let's create exceptions");
        RuntimeException e = new RuntimeException();
   //    throw new RuntimeException();
      //  throw e;
        String userName = "";
        if (userName.isEmpty()){
            throw  new RuntimeException("username can n ot empty");
         //   Asser.fail.(reason why is failing)
        }


    }
}
