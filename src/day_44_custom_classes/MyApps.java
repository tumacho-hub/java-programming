package day_44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
// this class is use to created objects of app

        String app1 = "uber"; //string variable only
       App uberApp = new App();



        uberApp.name = "uber"; // thi is how we create objects from other class
        uberApp.version = 3.5;
        uberApp.open(); // call open method using the object variable

    }
}
