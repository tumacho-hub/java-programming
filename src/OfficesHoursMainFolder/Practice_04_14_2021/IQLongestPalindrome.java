package OfficesHoursMainFolder.Practice_04_14_2021;
/*
[IQ] Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
Ex:
Input: ["java", "longer" "word", "civic" "apple", "racecar", "mom", "anna"]
Output: racecar
Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
 */
public class IQLongestPalindrome {
    public static void main(String[] args) {

        String [] words = {"java", "longer", "word", "civic", "apple", "racecar", "mom", "anna"};
       String longestPalindrome = "";



        for (String each : words){

            boolean isPalindrome = true;

            for (int i = 0; i < each.length()/2; i++){

                if (each.charAt(i)  != each.charAt(each.length()-1-i)){
                    isPalindrome = false;
                  break;


                }


            }
              if (isPalindrome && each.length() > longestPalindrome.length()){
                 longestPalindrome = each;

                    }
                }
        System.out.println(longestPalindrome.isEmpty() ? "No palindrome " : longestPalindrome);
        }



        }




