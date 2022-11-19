
  Feature: US1004 Parametre Kullanma

    @smokeTest
    Scenario: TC08 Kullanici parametre ile verilen kelimeyi amazonda aratabilmeli

      Given Kullanici amazon anasayfaya gider
      Then Arama cubuguna "Levent" yazip aratir
      And Arama sonuclarinin "Levent" icerdigini test eder
      And Sayfayi kapatir