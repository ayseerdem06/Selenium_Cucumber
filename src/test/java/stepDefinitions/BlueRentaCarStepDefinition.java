package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarStepDefinition {

    BrcPage brcPage=new BrcPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.ilkLoginButonu.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.emailTexBox.sendKeys("gecersiz@gmail");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.passwordTexBox.sendKeys("145263");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.ikinciLoginButonu.click();

    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.validEmail.isDisplayed());

    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
