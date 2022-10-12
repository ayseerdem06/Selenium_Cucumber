package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    public WebElement moveElement;

    @FindBy (xpath = "//span[@class='nav-action-inner']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement email;

    @FindBy (xpath = "//*[.='There was a problem']")
    public WebElement problemMessage;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//div[@class='a-expander-content a-expander-inline-content a-expander-inner a-expander-content-expanded']")
    public WebElement forgotYourPassword;

    @FindBy(xpath = "//h1")
    public WebElement paswordAssistanceText;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    public WebElement createAccountSubmit;

    @FindBy(xpath = "//h1")
    public WebElement createAccountText;


}
