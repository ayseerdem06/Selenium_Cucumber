package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriverPage;
import utilities.Driver;

import java.util.ArrayList;

public class WebDriverStepDefinition {

    Actions actions = new Actions(Driver.getDriver());
    WebDriverPage webDriverPage=new WebDriverPage();
    ArrayList<String>window;
    String ilkWindow;

    @Then("kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
        ilkWindow=Driver.getDriver().getCurrentUrl();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
        webDriverPage.login.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
        window=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(window.get(1));

    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String name) {
        webDriverPage.username.sendKeys(name);
    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String pass) {
            webDriverPage.password.sendKeys(pass);                      // actions.sendKeys(Keys.TAB).sendKeys(pass).perform();
    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        webDriverPage.loginbutton.click();          //actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
        String actualPopupText=Driver.getDriver().switchTo().alert().getText();
        String expectedPopupText="validation failed";
        Assert.assertEquals(expectedPopupText,actualPopupText);

    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
        Driver.getDriver().switchTo().window(window.get(0));
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ilkWindow);

    }

    @And("sayfalari kapatir")
    public void sayfalariKapatir() {
        Driver.quitDriver();
    }
}
