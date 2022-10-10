package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.Trendyol_MorhipoPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trendyol_MorhipoStepDefinitions {

    Trendyol_MorhipoPage trendyolMorhipo=new Trendyol_MorhipoPage();

    String trendyolWindowHandle;
    int trendyolToplamUrunSayisi;

    String morhipoWindowHandle;
    int morhipoUrunSayisi;

    @Given("Kullanici google'a gider")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get(ConfigReader.getProperty("google"));
    }

    @Then("Kullanici gogle arama sayfasinda trendyol aratir")
    public void kullaniciGogleAramaSayfasindaTrendyolAratir() {
        trendyolMorhipo.googleSearch.sendKeys("www.trendyol.com", Keys.ENTER);

    }

    @And("Kullanici trendyol linkini tiklar siteye gider")
    public void kullaniciTrendyolLinkiniTiklarSiteyeGider() throws InterruptedException {
        trendyolMorhipo.trendyol.click();
        trendyolMorhipo.xKapat.click();
        Thread.sleep(1000);
        trendyolWindowHandle=Driver.getDriver().getWindowHandle();


    }

    @And("Kullanici trendyol ana sayfadan makas aratir")
    public void kullaniciTrendyolAnaSayfadanMakasAratir() throws InterruptedException {
        trendyolMorhipo.trendyolSearch.sendKeys("makas",Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("Kullanici toplam trendyol urun sayisini alir")
    public void kullaniciToplamTrendyolUrunSayisiniAlir() {
        String [] tdarr= trendyolMorhipo.sonucYazisiTrendyol.getText().split(" ");
        trendyolToplamUrunSayisi= Integer.parseInt(tdarr[3]);
        System.out.println("Trendyol urun sayisi :"+ trendyolToplamUrunSayisi);

    }

    @And("Kullanici yeni sekmede Morhipo'ya gider")
    public void kullaniciYeniSekmedeMorhipoYaGider() {
       Driver.getDriver().switchTo().newWindow(WindowType.TAB);
       Driver.getDriver().get(ConfigReader.getProperty("morhipo"));
       morhipoWindowHandle=Driver.getDriver().getWindowHandle();

    }

    @And("Kullanici makas aratir")
    public void kullaniciMakasAratir() throws InterruptedException {
        trendyolMorhipo.morhipoSearch.sendKeys("makas"+Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("Kullanici toplam morhipo urun sayisini alir")
    public void kullaniciToplamMorhipoUrunSayisiniAlir() {
        String [] mrhbarr=trendyolMorhipo.sonucYazisiMorhipo.getText().split(" ");
        morhipoUrunSayisi= Integer.parseInt(mrhbarr[0]);
        System.out.println("Morhipo urun sayisi : "+ morhipoUrunSayisi);

    }

    @And("Kullanici iki sitedeki toplam makas sayisini karsilastir")
    public void kullaniciIkiSitedekiToplamMakasSayisiniKarsilastir()  {


    }

    @And("Kullanici urun sayisi fazla olan siteyi kapatir")
    public void kullaniciUrunSayisiFazlaOlanSiteyiKapatir() {
        if(trendyolToplamUrunSayisi>morhipoUrunSayisi){
            Driver.getDriver().switchTo().window(trendyolWindowHandle);
            Driver.closeDriver();
        }else {
            Driver.getDriver().switchTo().window(morhipoWindowHandle);
            Driver.closeDriver();
        }
    }

    @And("Kullanici diger sayfayi da kapatir")
    public void kullaniciDigerSayfayiDaKapatir() throws InterruptedException {
        Thread.sleep(1000);
        Driver.quitDriver();

    }



}
