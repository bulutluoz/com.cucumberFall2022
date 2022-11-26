Feature: JDBC03 Kullanici database'de update yapabilmeli
  @update
  Scenario: TC03 kullanici id degeri ile istedigi soyismi update ettigini test eder

    Given Kullanici JDBC ile database'e baglanir
    Then id degeri 14 olan kisinin "last_name" degerini "happiness" yapar
    And id si 14 olan kisinin "last_name" degerinin "happiness" oldugunu test eder
