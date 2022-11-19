Feature: US1001 Amazon arama testi
  @Regression @pt1
  Scenario: TC01 Kullanici Amazonda arama yapabilmeli

    Given Kullanici amazon anasayfaya gider
    When Arama cubuguna Nutella yazip aratir
    Then Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayi kapatir