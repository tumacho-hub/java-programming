package day_52_inheritance;

public class Discord extends mobileApp{
    public void chat(String someone){
        System.out.println("Chatting with " + someone +" on discord" );


        }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Vladislav");
    }


        public boolean downLoad(){
            System.out.println("DonwLoaded Discord 0.0.23 from app store " + getVersion());
            return true;

    }

    public void printInfo(){
        System.out.println("App Name = " + getName());
        System.out.println("App version = "+ getVersion());
    }
}
