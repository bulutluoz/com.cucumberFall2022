package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepdefinitions {
    HerokuappPage herokuappPage=new HerokuappPage();

    @Then("Herokuapp Add Element butonuna basar")
    public void herokuapp_add_element_butonuna_basar() {

        herokuappPage.addButonu.click();
    }
    @Then("Herokuapp Delete butonu gorunmesini bekler")
    public void herokuapp_delete_butonu_gorunmesini_bekler() {
        // delete butonu 15 saniyelik implicitlyWait suresi icerisinde gorundugunden
        // buraya ekstra explicit wait olusturmaya gerek yok
        // Illa da bekleyelim isteniyorsa
        ReusableMethods.bekle(3);
    }
    @Then("Herokuapp Delete butonunun gorunur oldugunu test eder")
    public void herokuapp_delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }
    @Then("Herokuapp Delete butonuna basarak butonu siler")
    public void herokuapp_delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButton.click();
    }
    @Then("Herokuapp Delete butonunun gorunmedigini test eder")
    public void herokuapp_delete_butonunun_gorunmedigini_test_eder() {

    }
}
