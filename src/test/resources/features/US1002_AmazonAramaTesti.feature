

Feature: US1002_Amazon Arama Testi

  # Kullanicinin arama yapmasi icin 3 scenario olusturun
  # Nutella, Java ve Apple icin arama yapip sonuclarin aranan kelime icerdigini test edin

  @pt1
  Scenario: TC02  Kullanici amazonda Nutella aramasi yapar

    Given Kullanici amazon anasayfaya gider
    Then Arama cubuguna Nutella yazip aratir
    And Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayi kapatir
  @smokeTest @Regression
  Scenario: TC03 Kullanici amazonda Java aramasi yapar
    Given Kullanici amazon anasayfaya gider
    Then Arama kutusuna Java yazip aratir
    And Arama sonuclarinin Java icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC04 Kullanici amazonda Apple aramasi yapar
    Given Kullanici amazon anasayfaya gider
    Then Arama kutusuna Apple yazip aratir
    And Sonuclarin Apple icerdigini test eder
    And Sayfayi kapatir