package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NinjaPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class NinjaStepDefinitions {

    NinjaPage ninjaPage=new NinjaPage();
    List<String> telefonIsimleri=new ArrayList<>();
    List<String>sepettekiTelefonlar=new ArrayList<>();

    @Given("Kullanici tutorialsninja.com sayfasina gider")
    public void kullaniciTutorialsninjaComSayfasinaGider() {
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @Then("Kullanici Phones & PDAs'a tıklar")
    public void kullaniciPhonesPDAsATıklar() {
        ninjaPage.phonesPDas.click();
    }

    @And("Kullanici Telefonlarin markalarini alir")
    public void kullaniciTelefonlarinMarkalariniAlir() throws InterruptedException {
        for (WebElement w:ninjaPage.telefonMarkalari
             ) {
            telefonIsimleri.add(w.getText());
            Thread.sleep(1000);

        }
        System.out.println("Telefon isimleri : "+ telefonIsimleri);
    }

    @And("Kullanici Tum ogeleri sepete ekler")
    public void kullaniciTumOgeleriSepeteEkler() throws InterruptedException {
        for (WebElement w:ninjaPage.addToCart
             ) {
            w.click();
            Thread.sleep(1000);
        }

    }

    @And("Kullanici sepete tiklar")
    public void kullaniciSepeteTiklar() {

        ninjaPage.cartTotal.click();
    }

    @And("Kullanici sepetteki isimleri alir")
    public void kullaniciSepettekiIsimleriAlir() throws InterruptedException {
        for (WebElement w:ninjaPage.sepettekiUrunler
             ) {
            sepettekiTelefonlar.add(w.getText());
            Thread.sleep(1000);
            System.out.println("Sepette eklenen telefonlar: "+ sepettekiTelefonlar);
        }

    }

    @And("Kullanici sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir")
    public void kullaniciSepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastirir() {

        Assert.assertTrue(sepettekiTelefonlar.containsAll(telefonIsimleri));

    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


}
