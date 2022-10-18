package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utilities.Driver;

import java.util.Random;

public class PracticeFormStepDefs {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        Driver.getDriver().get(url);

    }
    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void username_password_ve_textarea_kisimlarini_doldurur(String username, String password, String textarea) {
        username= Faker.instance().name().username();
        password= Faker.instance().internet().password();
        textarea= Faker.instance().animal().name();

        practiceFormPage.username.sendKeys(username);
        practiceFormPage.password.sendKeys(password);
        practiceFormPage.textarea.clear();
        practiceFormPage.textarea.sendKeys(textarea);

    }
    @When("bir dosya yukler")
    public void bir_dosya_yukler() {
        // practiceFormPage.chooseFile.sendKeys("C:\\Users\\mua\\Desktop\\test.txt");

        String homeDirectory= System.getProperty("user.home");
        String filePath =homeDirectory+"/Desktop/test.txt";
        practiceFormPage.chooseFile.sendKeys(filePath);

    }
    @When("checkbox1 i secer")
    public void checkbox1_i_secer() {
        if(!practiceFormPage.checkBox1.isSelected()){
            practiceFormPage.checkBox1.click();
        }

        if(practiceFormPage.checkBox2.isSelected()){
            practiceFormPage.checkBox2.click();
        }

        if(practiceFormPage.checkBox3.isSelected()){
            practiceFormPage.checkBox3.click();
        }

    }
    @When("radio2 yi secer")
    public void radio2_yi_secer() {
        practiceFormPage.radio2.click();

    }
    @When("selection item3 secer")
    public void selection_item3_secer() {

        practiceFormPage.selectItem3.click();

    }
    @When("dropdown itmem4 secer")
    public void dropdown_itmem4_secer() {
        Select select = new Select(practiceFormPage.dropdown);
        Random random = new Random();
        int rastgele= random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(rastgele);

    }
    @When("submite tiklar")
    public void submite_tiklar() {
        practiceFormPage.submitButton.click();

    }
    @Then("dosyanin yuklendigini dogrular")
    public void dosyanin_yuklendigini_dogrular() {

        Assert.assertTrue(practiceFormPage.fileName.isDisplayed());

    }
}
