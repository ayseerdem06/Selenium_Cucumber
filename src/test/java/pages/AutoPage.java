package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class AutoPage {
    public AutoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@class='login']")
    public WebElement login;
    @FindBy (xpath = "//*[@id='email_create']")
    public WebElement createEmail;
    @FindBy (xpath = "//*[@id='uniform-id_gender1']")
    public WebElement radioButton;
}