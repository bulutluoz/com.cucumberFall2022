Feature: US1008 Herokuapp Wait Testleri


  Scenario: TC16 Kullanici wait islemlerinin calistigini test eder

    Given Kullanici "herokuUrl" anasayfaya gider
    Then Herokuapp Add Element butonuna basar
    And Herokuapp Delete butonu gorunmesini bekler
    And Herokuapp Delete butonunun gorunur oldugunu test eder
    Then Herokuapp Delete butonuna basarak butonu siler
    And Herokuapp Delete butonunun gorunmedigini test eder
    Then Sayfayi kapatir

# Yeni bir sayfada calismaya basladigimizda
# 1- Feature dosyasi olusturalim
# 2- Eksik adimlari olusturmak icin
#    Runner class'inda dryRun=true yapip , Runner'i calistiralim
#    Olusturulan eksik adimlari, Yeni bir Class olusturup icerisine yapistiralim
# 3- Stepdefinition class'indaki eksik adimlarin Java kodlarini POM'e uygun olarak yazalim
# 4- Locate'leri yapmak icin page sayfasi olusturalim
#    Page class'ini acinca bir constructor olusturup, Pagefactory.initElements()
#    method'unu kullanarak Driver'imizi page sayfasina tanitalim
