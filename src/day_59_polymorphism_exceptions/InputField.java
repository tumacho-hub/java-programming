package day_59_polymorphism_exceptions;

public class InputField implements WebElement{
    public static final String TAG_NAME = "Input";

    public String getValue(){
        System.out.println("Getting the value in the InputField");
        return "selenium";
    }



    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field" + txt);

    }

    @Override
    public void click() {
        System.out.println("clicking on web");

    }

    @Override
    public String getText() {
        System.out.println("getting the text ");
        return null;
    }
}
