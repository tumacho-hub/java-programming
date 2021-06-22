package day_55_abstarction.interface_demo;

public interface WebDriver {
    public abstract void get(String url);

    public abstract void findElement(String locator);

    void quit();// public abstract has already being assign by default.

    String getTitle();
}