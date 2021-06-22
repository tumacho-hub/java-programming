package day_55_abstarction.interface_demo;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver - navigate to  "+ url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FireFoxDriver - locating element by " + locator);

    }

    @Override
    public void quit() {
        System.out.println("FireFoxDriver - quitting the driver");

    }

    @Override
    public String getTitle() {
        return "Wooden spoon title";
    }
}
