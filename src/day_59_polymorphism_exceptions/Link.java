package day_59_polymorphism_exceptions;

public class Link implements WebElement{
    public static final String TAG_NAME = "a";  // constant variable is equals to final!!

    public void getLinkHref(){
        System.out.println("https://java.com");
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("not supported");

    }

    @Override
    public void click() {
        System.out.println("Clicking the link");
    }

    @Override
    public String getText() {
        System.out.println("Getting the text");
       return "Oracle Java";
    }
}
