package day_52_inheritance;

public class AppObjects {

    public static void main(String[] args) {
         mobileApp mobileApp = new mobileApp();
         mobileApp.setName("youtube");
         mobileApp.setVersion(5.3);
         mobileApp.useTheApp(10);
         mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);
        instagram.setVersion(5.3);
        instagram.download();

        Discord  b22Discord = new Discord();
        b22Discord.setName("discord");
        b22Discord.setVersion(6.234);
        b22Discord.useTheApp(100);
        b22Discord.downLoad();
        b22Discord.printInfo();
        System.out.println("b22Discord.getName() = " + b22Discord.getName());


    }

    }

