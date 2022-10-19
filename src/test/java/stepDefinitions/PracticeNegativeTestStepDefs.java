package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PracticeNegativeTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class PracticeNegativeTestStepDefs {

    PracticeNegativeTestPage pntp = new PracticeNegativeTestPage();

    @Given("kullanici {string} ana sayfasina gider")
    public void kullaniciAnaSayfasinaGider(String url) {
        Driver.getDriver().get(url);

    }
    @When("login olmak icin signin e tiklar")
    public void login_olmak_icin_signin_e_tiklar() {
        ReusableMethods.waitForClickablility(pntp.signinSymbol,5);
        pntp.signinSymbol.click();
        pntp.signinButton.click();

    }
    @When("username icin {string} kullanici adini gonderir")
    public void username_icin_kullanici_adini_gonderir(String username) {

        username= Faker.instance().name().username();
        pntp.username.sendKeys(username);

    }
    @When("password icin {string} parolasini gonderir")
    public void password_icin_parolasini_gonderir(String password) {

        password=Faker.instance().internet().password();
        pntp.password.sendKeys(password);

    }
    @When("signine tiklar")
    public void signine_tiklar() {

        pntp.signinWithCredentials.click();

    }
    @Then("Authentication information not correct uyarisini dogrular")
    public void authentication_information_not_correct_uyarisini_dogrular() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(pntp.popUpMessage));

        Assert.assertTrue(pntp.popUpMessage.isDisplayed());
    }


}