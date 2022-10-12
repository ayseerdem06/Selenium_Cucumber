package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeAmazonPage {

    public PracticeAmazonPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement signinButton;

    @FindBy (xpath = "//input[@id='ap_email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='continue']")
    public WebElement continiueButton;

    @FindBy (xpath = "//*[.='There was a problem']")
    public WebElement problemMessage;

    @FindBy (xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy (xpath = "//a[@id='auth-fpp-link-bottom']")
    public WebElement forgotPasswordLink;

    @FindBy (xpath = "//h1")
    public WebElement passwordAssistanceText;

    @FindBy (xpath = "//a[@id='createAccountSubmit']")
    public WebElement createYourAccountButton;

    @FindBy (xpath = "//h1")
    public WebElement createAccountText;

}
