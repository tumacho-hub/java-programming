package day_59_polymorphism_exceptions;
/*
new interface WebElement
    -> sendKeys(String txt)
    -> click()
    -> getText()

class Link implements WebElement
    overrides the methods
    getLinkHref

class InputField implements WebElement
    overrides the methods
    getValue
 */
public interface WebElement {
    void sendKeys(String txt);
    void click();
    String getText();

}
