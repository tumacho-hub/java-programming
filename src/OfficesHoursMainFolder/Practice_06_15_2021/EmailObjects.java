package OfficesHoursMainFolder.Practice_06_15_2021;

public class EmailObjects {
    public static void main(String[] args) {
        Email email = new Email("Jorge@cybertekschool.com", 43);
      //  email.ADDRESS= "email"; this is address final can not be change!
        System.out.println(email);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();


        Gmail gmail = new Gmail("kamran@gmail.com", 133);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("jorge@yahoo.com", 155);
        System.out.println(yahoo);
        System.out.println(Yahoo.domain);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();

        Email email1 = new Email("random@email",4);
        // it will print yahoo because the static block that we already created
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);

        Email.sendEmail();
        Gmail.sendEmail();
        Gmail.sendSuperEmail();




    }
}
