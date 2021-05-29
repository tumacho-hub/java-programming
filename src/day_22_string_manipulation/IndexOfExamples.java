package day_22_string_manipulation;

public class IndexOfExamples {
    public static void main(String[] args) {
        String technologies = " java,html,css,selenium,testing,maven,cucumber";

        System.out.println(technologies.length());

        System.out.println(technologies.charAt(20));

        System.out.println(technologies.substring(20,46));

        System.out.println(technologies.indexOf(8,16));

       if (technologies.indexOf(8,16) > -1 ){
           System.out.println("Passed: index present");
       }else{
           System.out.println("not present");
       }


        if (technologies.contains("cucumber") && technologies.contains("selenium")) {
            System.out.println("PASSED: Both words are correct!!");
        } else {
            System.out.println("You missed them!");
            System.out.println("-------------------------------------");

        }
    }
}
