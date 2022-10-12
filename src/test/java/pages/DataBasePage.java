package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataBasePage {

    public DataBasePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='New']")
    public WebElement newButon;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement position;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement office;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extn;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement date;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;

    @FindBy(xpath = " //button[@class='btn']")
    public WebElement createbtn;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement search;

    @FindBy(xpath = "//*[@class='sorting_1']")
    public WebElement isimVar;











}
