package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeTC07Page {
    public PracticeTC07Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='/test_cases'])[1]")
    public WebElement testcaseLink;

    @FindBy (xpath = "//b[text()='Test Cases']")
    public WebElement testCaseTitle;
}
