
 Feature: Parametre Kullanimi


   Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
     Given kullanici "faceUrl" sayfasina gider
     Then kullanici 3 saniye bekler
     When Url'in "facebook" icerdigini test edelim
     And sayfayi kapatir


   Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
     Given kullanici "google" sayfasina gider
     Then kullanici 3 saniye bekler
     When Url'in "google" icerdigini test edelim
     And sayfayi kapatir


   Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
     Given kullanici "brcUrl" sayfasina gider
     Then kullanici 3 saniye bekler
     When Url'in "blue" icerdigini test edelim
     And sayfayi kapatir


   Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
     Given kullanici "amazonUrl" sayfasina gider
     Then kullanici 3 saniye bekler
     When Url'in "amazon" icerdigini test edelim
     And sayfayi kapatir