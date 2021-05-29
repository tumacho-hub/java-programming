package TEST;

import java.util.Scanner;
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.
 */

public class party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  String name = "";
  String answer = "";
  String guestList = name;

  do {
      System.out.println("Please enter guest name:");
      name =input.next();

      guestList += name;

      System.out.println("Do you want to enter new guest name:");
      answer = input.next();

      if (answer.equalsIgnoreCase("yes")){
          guestList += ", ";
      }

  } while(answer.equalsIgnoreCase("yes"));
        System.out.println("Guest' list: " + guestList);

    }
}


