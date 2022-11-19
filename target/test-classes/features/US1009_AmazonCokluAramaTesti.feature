Feature: US1009 Kullanici liste olarak verilen urunleri Amazon'da aratir

# Amazon ana sayfaya gidip Nutella, java, Apple, Samsung, LG icin arama yapip
# arama sonuclarinin aranan kelimeleri icerdigini test edin

  Scenario Outline: TC17 Kullanici liste olarak arama testi yapabilmeli

    Given Kullanici "amazonUrl" anasayfaya gider
    Then Arama cubuguna "<istenenKelime>" yazip aratir
    And Arama sonuclarinin "<istenenKelime>" icerdigini test eder
    Then Sayfayi kapatir

    Examples:
    |istenenKelime|
    |Nutella      |
    |Java         |
    |Apple        |
    |Samsung      |
    |LG           |