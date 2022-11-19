package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },
        features = "src/test/resources/features",
        glue="stepdefinitions",
        tags= "@pt1",
        dryRun = false
)

public class TestRunner1 {
    /*
    Bir framework'de bir tek Runner class'i yeterli olabilir
    Runner class'inda class body'sinde hic bir sey olmaz
    Runner class'imizi onemli yapan 2 adet annotaion vardir
    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz

    features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue : step definitions dosyalarini nerede bulacagimizi gosterir
    tags : o an hangi tag'i calistirmak istiyorsak onu belli eder

   dryRun : iki secenek var
   dryRun=true; yazdigimizda Testimizi calistirmadan sadece eksik adimlari bize verir
                eksik adim yoksa, testi calistirmadan test passed yazar
   dryRun=false yazdigimizda testlerimizi calistirir
                eksik adim varsa, ilk eksik adimda calismayi durdurur ve
                eksik adimlari bize verir

     */
}
