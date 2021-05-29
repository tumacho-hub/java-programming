package day_37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(20,5,10);
        addNumbers(5,12,5,8,10);
        addNumbers();
        //  int ... myNumber = 10, 4, error, var-args can only be used as a method parameter...
    }
                                  ///// VARARGS\\ INSIDE THE METHODS

    public static void  addNumbers(int ... nums){
        int sum = 0;
        ///// we need some type of  loop to calculate in ARRAY!
        for (int n : nums){
            sum+=n;
        }
        System.out.println("Sum = " + sum);

    }
}
