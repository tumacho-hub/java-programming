package OfficesHoursMainFolder.Practice_04_19_2021;

public class MethodClass {
    /*

    void -> run a block of code, there is no return value
    Array.sort() -> takes an array,sort it,doesn't return anything

    return -> runs a block of code but there is a return value

    Arrays.binarySearch() -> takes an array and element, tries to find the element, returns the index of the element.
     */



    public static void methosOne(){
        System.out.println("one");
    }

 // when using STRING METHODS we have to use method return
    public static  String methodTwo(){
        return "two";

    }
public static int methodThree(String word){
return word.length();

}
// we use a parameter when we need information to run our code
public static boolean login (String username, String password){

        return  true;
}



// Example when you don't parameters

public static boolean clickButton(){
    return true;
}
}