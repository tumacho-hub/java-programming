package day_55_abstarction.interface_demo;

public class ChromeDriver implements WebDriver{


public ChromeDriver(){
    System.out.println("Launching Chrome from driver");
}
    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - locating element by locator " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("WebDriver - quitting the driver ");
    }

    @Override
    public String getTitle() {
        return "Wooden spoon";
    }
}
