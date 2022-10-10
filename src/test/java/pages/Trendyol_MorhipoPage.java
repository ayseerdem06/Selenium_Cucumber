package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Trendyol_MorhipoPage {

    public Trendyol_MorhipoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleSearch;

    @FindBy (xpath = "(//cite[@class='iUh30 tjvcx'])[1]")
    public  WebElement trendyol;

    @FindBy (xpath = "//*[@height='13px']")
    public WebElement xKapat;

    @FindBy(xpath = "//input[@class='vQI670rJ']")
    public WebElement trendyolSearch;

    @FindBy (xpath = "//div[@class='dscrptn']")
    public WebElement sonucYazisiTrendyol;

    @FindBy (xpath = "//input[@id='pw-search-input']")
    public WebElement morhipoSearch;

    @FindBy (xpath = "//*[@id='total-product-count']")
    public WebElement sonucYazisiMorhipo;
}
