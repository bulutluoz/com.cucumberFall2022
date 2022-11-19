
  Feature: US1003 Background kullanarak Amazon arama testi


    Background: amazon anasayfaya gitme
      Given Kullanici amazon anasayfaya gider
    @Paralel1
    Scenario: TC05  Kullanici amazonda Nutella aramasi yapar


      Then Arama cubuguna Nutella yazip aratir
      And Arama sonuclarinin Nutella icerdigini test eder
      And Sayfayi kapatir

    Scenario: TC06 Kullanici amazonda Java aramasi yapar

      Then Arama kutusuna Java yazip aratir
      And Arama sonuclarinin Java icerdigini test eder
      And Sayfayi kapatir
    @apple
    Scenario: TC07 Kullanici amazonda Apple aramasi yapar

      Then Arama kutusuna Apple yazip aratir
      And Sonuclarin Apple icerdigini test eder
      And Sayfayi kapatir