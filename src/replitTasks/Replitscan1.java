package replitTasks;

import java.util.Scanner;
public class Replitscan1 {
    public static void main(String[] args) {
    /*    Scanner input = new Scanner(System.in);
        System.out.println("Enter item and its price ");
        input.nextLine();
       String item1 = "Milk";
       double price1 = 3.99;
        System.out.println(item1 + "\n" + price1);
        System.out.println("Enter item and its price ");
        input.nextLine();
        String item2 = "Eggs";
        double price2 = 2.99;
        System.out.println(item2 + "\n" + price2);
        System.out.println("Enter item and its price ");
        input.nextLine();
        String item3 = "Ham";
        double price3 = 4.99;
        System.out.println(item3 + "\n" + price3);
        System.out.println("Enter item and its price ");
        input.nextLine();
        String item4 = "Bread";
        double price4 = 2.55;
        System.out.println(item4 + "\n" + price4);
        System.out.println("Item1: " + item1 + " price: " +price1 + ", " + "Item2: " + item2 + " price: " +price2 + ","
                + "Item3: " + item3 + " price: " + price3 + ", " + "Item4: " + item4 + " price: " + price4 + ".");

     */
        String firstName = "Jorge, ";
        String lastName = "Flores";
        String fullName = "Jorge Flores";
        String email = "jorgeflores@hotmail.com";
        String street = "5708 w erie st, ";
        String state = "Illinois, ";
        String city = "Chicago, ";
        String address = "5708 w Erie st.";
        String contact = "Maria";
        int age = 34;
        int zipcode = 60651;
        double height = 5.8;
        double weight = 175;
        boolean isMarried = true;
        long workPhoneNumber = 224_123_2589L;
        long personalPhoneNumber = 773_996_0258L;

       Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter you personal information");
        System.out.println("Enter your first name");
        firstName = scan.nextLine();
        System.out.println("Enter your last name");
        lastName = scan.nextLine();
        System.out.println("Enter your email");
        email = scan.nextLine();
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your state");
        state = scan.nextLine();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber =  scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();

        String contacts = "work phone number-" + workPhoneNumber +"," + " personal phone number-" + personalPhoneNumber + "," + " email: " + email;
        String FullName1 = firstName + " " + lastName;
        String mainAddress = street + city + state + " " +  zipcode;
        System.out.println("Patient personal information: " + "\n" + "Full name: " + FullName1 + "\n" + "Address : "  +  mainAddress + "\n" + "Contacts: " + contacts + "\n" + "Age: " +
                age + "\n" + "Height: " + height + "\n"+ "Weight: " + weight +"\n" + "Married?: " + isMarried);



        }
    }
