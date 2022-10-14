#//- Google'a gidiniz
#//- trendyol'u aratınız
#//- trendyol linkini bulup siteye gidiniz
#//- makas aratınız
#//- toplam ürün sayısını alınız
#//- yeni sekmede morhipo'ya gidiniz
#//- makas aratınız
#//- toplam ürün sayısını alınız
#//- iki sitedeki toplam makas sayısını karşılaştırınız
#//- Önce ürün sayısı fazla olan siteyi kapatınız
#//- Sonra diğer sayfayıda kapatınız

  Feature: Trendyol
    Scenario: US002 Kullanici trendyol ana sayfasindan makas aratir.
      Given Kullanici google'a gider
      Then Kullanici gogle arama sayfasinda trendyol aratir
      And Kullanici trendyol linkini tiklar siteye gider
      And Kullanici trendyol ana sayfadan makas aratir
      And Kullanici toplam trendyol urun sayisini alir
      And Kullanici yeni sekmede Morhipo'ya gider
      And Kullanici makas aratir
      And Kullanici toplam morhipo urun sayisini alir
      And Kullanici iki sitedeki toplam makas sayisini karsilastir
      And Kullanici urun sayisi fazla olan siteyi kapatir
      And Kullanici diger sayfayi da kapatir
