package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepdefinitions {
    AutomationPage automationPage=new AutomationPage();

    @Given("user signUp linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationPage.signUpLinki.click();
    }
    @Given("New user bölümüne name ve email adresi girer")
    public void new_user_bölümüne_name_ve_email_adresi_girer() {
        automationPage.isimKutusu.sendKeys("Ahmet1");
        automationPage.emailKutusu.sendKeys("gbhnhjmjhghdj@gmail.com");
    }
    @Given("SignUp butonuna basar")
    public void sign_up_butonuna_basar() {
        automationPage.signUpButonu.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

        Actions actions= new Actions(Driver.getDriver());
        actions.click(automationPage.erkekTitleradioButon)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("123456")
                .sendKeys(Keys.TAB)
                .sendKeys("20")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1998")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Nevzat")
                .sendKeys(Keys.TAB)
                .sendKeys("Celik")
                .sendKeys(Keys.TAB)
                .sendKeys("ISVEC")
                .sendKeys(Keys.TAB)
                .sendKeys("huddinge/Stockholm")
                .sendKeys(Keys.TAB)
                .sendKeys("-")
                .sendKeys(Keys.TAB)
                .sendKeys("New Zealand")
                .sendKeys(Keys.TAB)
                .sendKeys("-")
                .sendKeys(Keys.TAB)
                .sendKeys("Stockholm")
                .sendKeys(Keys.TAB)
                .sendKeys("12321")
                .sendKeys(Keys.TAB)
                .sendKeys("+4623232323")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();


    }
    @Given("user create account butonuna basar")
    public void user_create_account_butonuna_basar() {
       // automationPage.createAccountButonu.click();
    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automationPage.createAccountButonu.isDisplayed());
    }

}
