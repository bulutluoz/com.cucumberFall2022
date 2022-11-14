  @wip
  Feature: US1005 Parametreli Configuration.properties Kullanimi

    # 3 farkli senaryo olusturup
    # amazon, mycoursedemy ve wisequarter anasayfalarina gidip
    # url'in bu kelimeleri icerdigini test edin

    Scenario: TC09 kullanici amazon sayfasina gidebilmeli
      Given Kullanici "arabamUrl" anasayfaya gider
      Then url'in "arabam" icerdigini test eder
      And Sayfayi kapatir

    Scenario: TC10 kullanici mycoursedemy sayfasina gidebilmeli
      Given Kullanici "myUrl" anasayfaya gider
      Then url'in "mycoursedemy" icerdigini test eder
      And Sayfayi kapatir

    Scenario: TC11 kullanici wisequarter sayfasina gidebilmeli
      Given Kullanici "wiseUrl" anasayfaya gider
      Then url'in "wisequarter" icerdigini test eder
      And Sayfayi kapatir
