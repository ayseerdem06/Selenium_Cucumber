@USOutline
Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi

    Given kullanici "<arananUrl>" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'in "<arananKelime>" icerdigini test edelim
    And sayfayi kapatir
    Examples:
      | arananUrl | arananKelime |
      | amazonUrl | amazon |
      | faceUrl | face |
      | brcUrl | blue |
      | google | google |