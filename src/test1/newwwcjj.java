package test1;
import java.util.Scanner;
public class newwwcjj {
    public static void main(String[] args) {

        String firstName, contacts;
        String lastName;
        String fullName;
        String email;
        String street;
        String state;
        String city;
        String address;

        int age, zipcode;
        double height, weight;
        boolean isMarried = true;
        long workPhoneNumber, personalPhoneNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
        lastName = scan.next();

        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();

        System.out.println("Enter your street");
         street = scan.next();

       System.out.println("Enter your city");
       city = scan.next();

        System.out.println("Enter your state");
         state = scan.next();

        System.out.println("Enter your zipcode");
        zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your height");
        height = scan.nextDouble();

        System.out.println("Enter you weight");
        weight = scan.nextDouble();

        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();

         contacts = "" + workPhoneNumber + "personal phone number" + personalPhoneNumber + email;
        fullName = firstName + "," + lastName;
        address = street + city + state + zipcode;
        System.out.println("Patient personal information" + "\n" + "Full name: " +fullName + "\n " + "Address: " + address + "\n" +
                "Contacts: work phone number - " + contacts + "\n" + "Age: " + age + "\n" + "Heigth: " + height + "\n" + "Weight: " + weight + "\n " + "Married?: "+ isMarried);

    }
}
