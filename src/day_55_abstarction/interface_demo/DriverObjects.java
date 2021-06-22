package day_55_abstarction.interface_demo;

import java.util.concurrent.Callable;

public class DriverObjects {
    public static void main(String[] args) {
      //  WebDriver driver1 = new WebDriver(); // error cannot create an object of interface
    ChromeDriver driver1 = new ChromeDriver();
    FireFoxDriver driver2 = new FireFoxDriver();
    WebDriver driver3 = new ChromeDriver();

    driver1.get("https://www.google.com");
    driver1.findElement("//input[@name='q']");
        System.out.println("driver1.getTitle() = " + driver1.getTitle());
    }
}
