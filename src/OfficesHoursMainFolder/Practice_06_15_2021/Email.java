package OfficesHoursMainFolder.Practice_06_15_2021;
// how do we achieved variable hidden?
//variable hidden is the same thing of hidden methods
public class Email {

       final String ADDRESS;
       int numberOfEmail;
       static String domain;

       static {
           domain = "generic";
       }

       public Email(String address,int numberOfEmail){
       this.ADDRESS = address;
       this.numberOfEmail = numberOfEmail;

       }
       public static void sendEmail(){
           System.out.println("sending from PARENT" );
       }

    @Override
    public String toString() {
        return "Email{" +
                "Address='" + ADDRESS + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ",domain=" + domain +
                '}';
    }
}
