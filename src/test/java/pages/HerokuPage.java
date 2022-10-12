package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuPage {

    public HerokuPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    public WebElement addElement;

    @FindBy(xpath = "//button[@class='added-manually']")
    public WebElement deleteButon;

    @FindBy(xpath = "//h3[.='Add/Remove Elements']")
    public WebElement addRemovesElementsText;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteElement;


}
