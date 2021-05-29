package OfficesHoursMainFolder.Practice_04_19_2021;

public class MethodClassTest {
    public static void main(String[] args) {
// in this case if we run both methods methodOne will be the only one to run or printing because is void!
 // VOID all it does it does is an action,
        MethodClass.methosOne();

// In the case of methodTwo we need to use it meaning printing or storing it in a variable otherwise we not
// returning the value!!
        MethodClass.methodTwo();
        System.out.println(MethodClass.methodTwo());
        String s = MethodClass.methodTwo();
        String s2 = "java is fun";
// when you have a METHOD THE PARAMETER is a necessary piece of information
// in order to run your method to compile
        System.out.println(MethodClass.methodThree(s2));


    }
}
