package day_52_inheritance;

public class mobileApp {

    private String name;
    private double version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    protected boolean download(){
        System.out.println("app: " + name + " version " + version + " is downloaded");
        return true;
    }

    public void useTheApp(int minutes){
        System.out.println("using " + name + " app for " + minutes + " minutes");



    }
}
