package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NinjaPage {

    public NinjaPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//a[text()='Phones & PDAs']")
    public WebElement phonesPDas;

    @FindBy (xpath = "//h4")
    public List<WebElement> telefonMarkalari;

    @FindBy (xpath = "//span[text()='Add to Cart']")
    public List<WebElement> addToCart;

    @FindBy (xpath = "(//*[@type='button'])[5]")
    public WebElement cartTotal;

    @FindBy (xpath = "//td[@class='text-left']")
    public  List<WebElement>sepettekiUrunler;


}
