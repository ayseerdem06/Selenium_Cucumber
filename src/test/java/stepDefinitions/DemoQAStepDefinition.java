package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQAPage;
import utilities.Driver;

import java.time.Duration;

public class DemoQAStepDefinition {
    DemoQAPage demoqa = new DemoQAPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    @When("kullanici Visible After bes seconds butonunun gorunur olmasini bekler")
    public void kullaniciVisibleAfterBesSecondsButonununGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.visibilityOf(demoqa.visible));

    }

    @And("kullanici Visible After bes seconds butonunun gorunur oldugunu test eder")
    public void kullaniciVisibleAfterBesSecondsButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(demoqa.visible.isDisplayed());
    }
}