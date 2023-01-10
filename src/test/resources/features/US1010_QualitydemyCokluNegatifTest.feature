Feature: US1010 liste olarak verilen wrong user ile negatif login testi

  @otomasyon
  Scenario Outline:

    Given Kullanici "myUrl" anasayfaya gider
    Then myCourse anasayfa login linkine tiklar
    And myCourse kullanici adi olarak "<istenenEmail>" girer
    And myCourse password olarak "<istenenPassword>" girer
    And 1 sn bekler
    Then myCourse login butonuna basar
    And 1 sn bekler
    And myCourse giris yapilamadigini test eder
    Then Sayfayi kapatir



    Examples:
    |istenenEmail|istenenPassword|
    |myYanlisEmail |myYanlisPassword |
    |myYanlisEmail1|myYanlisPassword1|
    |myYanlisEmail2|myYanlisPassword2|
