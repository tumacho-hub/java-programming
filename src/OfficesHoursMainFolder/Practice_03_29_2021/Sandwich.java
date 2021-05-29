package OfficesHoursMainFolder.Practice_03_29_2021;

public class Sandwich {
    /*
    A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread"
    in the given string , or return string "nothing" if there are not two pieces of bread.
    input: breadjambread    input: xxbreadapple
    output: jam             output: nothing
     */
    public static void main(String[] args) {

        String str = "breadhambread";

        // to solve this task we need to use the logic and think about what we need to do to get the middle word
        // apply all the options that come to your brain.

        // this "if str.contains("bread") " will start breaking the word apart

        if (str.contains("bread")){



            int firstBread = str.indexOf("bread");

// in this if statement we are using our variable int which is cutting the word and
// obtaining the first index of the word plus the whole word outcome

            if (str.substring(firstBread+5).contains("bread")){ // jambread

// we can do either or =  str.substring(firstBread+5).indexOf("bread");
                int secondBread = str.lastIndexOf("bread");

                String result = str.substring(firstBread + 5,  secondBread);

                if (result.isEmpty()){
                    System.out.println("nothing");
                }else {
                    System.out.println(result);
                }
            }


            }else{
            System.out.println("nothing");

        }
    }
 /*   we also have another way to modified it !! similar
 String str = "breadjambread";
 boolean isValid = false;
 String result = "";

 if(str.contains("bread")){
 int firstBread = str.indexOf("bread");
 if(str.substring(firstBread+5).contains("bread")){
 int secondBread = str.lastIndexOf("bread");
 result = str.substring(firstBread + 5, secondBread);
 isValid = true;
 }
 }
 if (!isValid || result.isEmpty()){
 System.out.println("Nothing")
 }else{
 System.out.println(result);







 }else{

 System.out.println(result);
  */
}
