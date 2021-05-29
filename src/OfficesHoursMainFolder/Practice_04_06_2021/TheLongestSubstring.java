package OfficesHoursMainFolder.Practice_04_06_2021;

public class TheLongestSubstring {
   /*
   Biggest substring of matching characters
   Given a string find the biggest substring of chars that match and print it.
   Ex: aaabbbcccccddddee
   output : ccccc
    */
   public static void main(String[] args) {

       String str = "aaabbbcccccddddee";
       String longestSubstring = "";
       String temp = "";

       for (int i = 0;  i < str.length()-1; i++){

           temp  += str.charAt(i);

           if(str.charAt(i) != str.charAt(i + 1)){

               if (temp.length() > longestSubstring.length()){
                   longestSubstring = temp;
               }
               temp = "";

           }



       }

   }
    }

