Feature: US1009 Ck Hotels Login
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici bluerentacar ana sayfasinda
    Then Login yazisina tiklar
    And kullanici 2 saniye bekler
    And gecersiz username girer
    And kullanici 2 saniye bekler
    And gecersiz password girer
    And kullanici 2 saniye bekler
    And Login butonuna basar
    And kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 2 saniye bekler
    And kulllanici sayfayi kapatir
