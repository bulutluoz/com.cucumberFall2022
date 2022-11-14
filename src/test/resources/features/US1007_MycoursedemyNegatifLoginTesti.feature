@wip
Feature: US1007 Yanlis Bilgilerle Giris yapilamaz

  # 3 farkli senaryo ile negatif login testi yapalim


  Scenario: TC13 Yanlis email, dogru password ile giris yapilamamali

    Given Kullanici "myUrl" anasayfaya gider
    #And myCourse cookies butonuna basar
    Then myCourse anasayfa login linkine tiklar
    And myCourse kullanici adi olarak "myYanlisEmail" girer
    And myCourse password olarak "myGecerliPassword" girer
    And myCourse login butonuna basar
    Then myCourse giris yapilamadigini test eder
    And Sayfayi kapatir

  Scenario: TC14 gecerli email, yanlis password ile giris yapilamamali

    Given Kullanici "myUrl" anasayfaya gider
    #And myCourse cookies butonuna basar
    Then myCourse anasayfa login linkine tiklar
    And myCourse kullanici adi olarak "myGecerliEmail" girer
    And myCourse password olarak "myYanlisPassword" girer
    And myCourse login butonuna basar
    Then myCourse giris yapilamadigini test eder
    And Sayfayi kapatir

  Scenario: TC15 Yanlis email, yanlis password ile giris yapilamamali

    Given Kullanici "myUrl" anasayfaya gider
    #And myCourse cookies butonuna basar
    Then myCourse anasayfa login linkine tiklar
    And myCourse kullanici adi olarak "myYanlisEmail" girer
    And myCourse password olarak "myYanlisPassword" girer
    And myCourse login butonuna basar
    Then myCourse giris yapilamadigini test eder
    And Sayfayi kapatir