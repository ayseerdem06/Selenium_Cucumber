Feature:US005 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://www.hepsiburada.com" sayfasinda
    Then kullanici 3 saniye bekler
    When Url'in "hepsiburada" icerdigini test edelim
    And sayfayi kapatir