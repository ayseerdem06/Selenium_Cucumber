Feature: : US008 OdevBRC

  @BRC
  Scenario Outline: : TC11 kullanici gecersiz bilgilerle giris yapar
    Given kullanici "brcUrl" anasayfasina gider
    Then Login yazisina tiklar
    And "<gecersizEmail>" username girer
    And "<gecersizPass>" password girer
    And brc Login butonuna basar
    Then brc sayfasina giris yapilamadigini kontrol eder
    And kullanici 3 sn bekler
    And  kullanici sayfayi kapatir
    Examples:
      | gecersizEmail | gecersizPass |
      | a@gmail.com | 12345 |
      | b@gmail.com | 67456 |
      | c@gmail.com | 987987 |
      | d@gmail.com | 654654 |
