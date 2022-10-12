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



    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    }

    @And("{string} username girer")
    public void usernameGirer(String gecersizemail) {
        brcPage.emailTexBox.sendKeys(gecersizemail);
    }

    @And("{string} password girer")
    public void passwordGirer(String gecersizPassword) {
        brcPage.passwordTexBox.sendKeys(gecersizPassword);
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        brcPage.ikinciLoginButonu.click();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        String expectedUrl="https://www.bluerentalcars.com/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
