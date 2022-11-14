@myCourse
Feature: US1006 Dogru kullanici adi ve password ile pozitif login testi

  Scenario: TC12 Kullanici mycoursedemy sitesine giris yapabilmeli

    Given Kullanici "myUrl" anasayfaya gider
    Then myCourse anasayfa login linkine tiklar
    And myCourse kullanici adi olarak "gecerliKullaniciAdi" girer
    And myCourse password olarak "gecerli password" girer
    And myCourse login butonuna basar
    Then myCourse giris yapabildigini test eder
    And Sayfayi kapatir
