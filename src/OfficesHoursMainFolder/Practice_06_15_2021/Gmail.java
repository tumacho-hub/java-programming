package OfficesHoursMainFolder.Practice_06_15_2021;
// can a class be static? yes classes can be static for inner classes
//static String domain; when you add this variable you basically are hidden the email domain
public class Gmail extends Email {
    static String domain;

    static {
        domain = "Gmail";
    }
    public static void sendEmail(){
        System.out.println("sending from Gmail" );
    }
    public static void sendSuperEmail(){
        Email.sendEmail();
    }

    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
