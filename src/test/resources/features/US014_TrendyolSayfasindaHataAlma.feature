
@gp6
Feature:US014 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://www.trendyol.com" sayfasinda
    Then kullanici 2 saniye bekler
    When Url'in "amazon" icerdigini test edelim
    And sayfayi kapatir