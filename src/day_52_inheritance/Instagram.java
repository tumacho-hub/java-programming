package day_52_inheritance;
// mobileapp is here
public class Instagram extends mobileApp {
    public void postPhoto() {
        System.out.println("Posting photo on instagram");

        //  how to we use the app whatever is specific to this. rule number
        //  #1same name, same parameters == to same signature
        // #2 access modifier must be the same or more visible.(PUBLIC=PUBLIC)/(DEFAULT=DEFAULT)/(PROTECTED/PROTECTED)/(PUBLIC=PUBLIC)
        //#3 return type must be the same or sometimes sub class version. if there is a subclass
        //covariant == return type(subClass return type ==  mobileapp==>discord,instagram.

    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        System.out.println("using instagram app features");
        postPhoto();



    }

}
