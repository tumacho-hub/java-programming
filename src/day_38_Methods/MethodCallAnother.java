package day_38_Methods;

public class MethodCallAnother {
    public static void main(String[] args) {
      start();
      keepContinue();
    }

    public static void start(){
        System.out.println("start");
        keepContinue();

    }

    public static void keepContinue(){
        System.out.println("keepContinue");
         end();
    }

    public static void end(){

            System.out.println("end");
        }


        }



