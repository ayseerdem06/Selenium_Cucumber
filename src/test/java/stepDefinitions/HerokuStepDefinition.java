package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuStepDefinition {

    HerokuPage herokuPage=new HerokuPage();

    @And("kullanici {string}  adresine gider")
    public void kullaniciAdresineGider(String arg0) {
        Driver.getDriver().get("herokuUrl");
    }

    @And("kullanici {string} butonuna tiklar")
    public void kullaniciButonunaTiklar(String addElement) {
        herokuPage.addElement.click();
    }

    @And("kullanici {string} butonu gorunur oluncaya kadar bekler")
    public void kullaniciButonuGorunurOluncayaKadarBekler(String DeleteButon) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuPage.deleteButon));
    }

    @And("kullanici {string} butonunun gorunur oldugunu test eder")
    public void kullaniciButonununGorunurOldugunuTestEder(String DeleteButon) {
        assert herokuPage.deleteButon.isDisplayed();
        //Bu sekilde de kullanilabiliyor
        //herokuPages.deleteButton.isDisplayed() sonuna nokta koyarsak
        // yukardaki sekilde de assert kullanimini assert true olarak kullanabiliriz
        //Eger assert equals kullanacaksak   assert herokuPages.addRemovesElementsText.getText().equals("Add/Remove Elements");
        // bu method sekli sadece true / onune unlem koyarsak false seklinde kullanilir
        // Assert.assertTrue(herokuPages.deleteButton.isDisplayed());
    }


    @And("kullanici {string} butonuna basarak butonu siler")
    public void kullaniciButonunaBasarakButonuSiler(String DeleteButon) {
        herokuPage.deleteButon.click();
    }

    @And("kullanici {string} butonunun gorunmedigini test eder")
    public void kullaniciButonununGorunmediginiTestEder(String DeleteButon) {
        assert ! herokuPage.deleteElement.isDisplayed();

    }

    @Then("kullanici AddRemove Elements yazisinin gorunurlugunu test eder")
    public void kullaniciAddRemoveElementsYazisininGorunurlugunuTestEder() {
        assert herokuPage.addRemovesElementsText.getText().equals("Add/Remove Elements");

    }
}
