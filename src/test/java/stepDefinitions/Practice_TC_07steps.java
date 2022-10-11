package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PracticeTC07Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07steps {

    PracticeTC07Page practiceTC07Page=new PracticeTC07Page();

    @Given("Tarayıciyi baslatarak {string} url'sine gidin")
    public void tarayiciyi_baslatarak_url_sine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);

    }
    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void ana_sayfanin_basariyla_gorunur_oldugunu_dogrulayin() {
        String homeUrl="https://automationexercise.com/";
        Assert.assertEquals("home Url esit degil",homeUrl,Driver.getDriver().getCurrentUrl());

    }
    @Then("Test Case buttonu na tiklayin")
    public void test_case_buttonu_na_tiklayin() {
        practiceTC07Page.testcaseLink.click();

    }
    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildigini_dogrulayin() {
         // String testCaseUrl="https://automationexercise.com/test_cases";     // Url den de dogrulama yapılır
        //   Assert.assertEquals(testCaseUrl,Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());      // Sayfa baslıgından da dogrulama yapılır

    }
    @Then("ilgili sayfanin ekran goruntusunu alin")
    public void ilgili_sayfanin_ekran_goruntusunu_alin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
