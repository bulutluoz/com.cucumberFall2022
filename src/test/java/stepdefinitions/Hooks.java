package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
       TestNG projemizde veya JUnit projemizde
       her class'dan veya method'dan once veya sonra
       calismasini istedigimiz method olsaydi

       ya icinde bulundugumuz class'da bir @Before... @After... olustururduk
       ya da extends ile bir class'i parent edinip
       o class'a @Before... @After... koyuyorduk

       Cucumber'da calisacak method'lar bir class'la sinirli degildir
       stepdefinitions package'i altindaki tum class'lardaki method'lar calistirilabilir

       Eger bizim butun testlerimiz icin herhangi bir @Before... @After...
       method'una ihtiyacimiz varsa
       stepdefinitions altinda herhangi bir class'a koymamiz yeterli olacaktir

       Projeler collectif calisildigindan
       ekipteki herkesin yerini bulabilmesi icin
       @Before... @After... method'lari kullanilacaksa
       Hooks class'ina konulmasi genel kullanim olarak benimsenmistir
     */
    @After
    public void tearDown(Scenario scenario){

        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
