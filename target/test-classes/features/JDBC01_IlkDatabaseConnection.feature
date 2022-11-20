Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

  @db
  Scenario: JDBC01 kullanici database'de sorgu yapabilmeli

    Given Kullanici JDBC ile database'e baglanir
    Then users tablosundaki isim verilerini alir
    And isim verilerini test eder