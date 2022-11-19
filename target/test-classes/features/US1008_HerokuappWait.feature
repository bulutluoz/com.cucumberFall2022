Feature: US1008 Herokuapp Wait Testleri

  @wip
  Scenario: TC16 Kullanici wait islemlerinin calistigini test eder

    Given Kullanici "herokuUrl" anasayfaya gider
    Then Herokuapp Add Element butonuna basar
    And Herokuapp Delete butonu gorunmesini bekler
    And Herokuapp Delete butonunun gorunur oldugunu test eder
    Then Herokuapp Delete butonuna basarak butonu siler
    And Herokuapp Delete butonunun gorunmedigini test eder
    Then Sayfayi kapatir






