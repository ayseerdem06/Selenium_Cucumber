#// http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidiniz
#// Phones & PDAs'a tıklayınız
#// Telefonların markalarını alınız
#// Tüm öğeleri sepete ekleyiniz
#// Sepete tıklayınız
#// Sepetteki isimleri alınız
#// Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız

  @tutorialsninja
  Feature: Tutorialsninja
    Scenario: Kullanici http://tutorialsninja.com/demo/index.php?route=common/home sayfasında
    Phones & PDAs aratır ve urunleri sepete ekletir
    Given Kullanici tutorialsninja.com sayfasina gider
      Then Kullanici Phones & PDAs'a tıklar
      And Kullanici Telefonlarin markalarini alir
      And Kullanici Tum ogeleri sepete ekler
      And Kullanici sepete tiklar
      And Kullanici sepetteki isimleri alir
      And Kullanici sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir
      And Kullanici sayfayi kapatir
