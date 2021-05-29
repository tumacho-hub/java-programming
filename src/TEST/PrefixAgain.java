package TEST;
import java.util.Locale;
import java.util.Scanner;
public class PrefixAgain {
    /*
    Given a String **str** and a number **n** check if the prefix (made of up of the first **n** characters) appears in the remaining part of the String. Print true or false.


Assume that the String is not empty and that **n** is in the range from 1 to str.length().

Examples:

```
input: abXYabc
input: 1

output: true
```
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        // for this task we had to add two more variables we don't need if statements

        String prefix = str.substring(0,n); // the reason why we using substring is to get the two first characters

        String remaining =  str.substring(n); // why "N" because we just need the remaining of the word looking for the same characters from the previous variable.


        System.out.println(remaining.contains(prefix));

        }






    }

