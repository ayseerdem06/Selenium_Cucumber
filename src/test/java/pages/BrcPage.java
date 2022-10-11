package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailTexBox;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement passwordTexBox;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement ikinciLoginButonu;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement validEmail;

    @FindBy(id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;
}
