
#Given, giris kısmında, -verilen, gidilen vs anlamında kullanılıyor,
# Then assertion yani doğrulamalarda kullanıyoruz, and tekrarlayanlarda kullanılıyor.
# When zaman anlamında givenden sonra bu -dığında, -dığı zaman anlamında.

@PracticeTC07
Feature: TC Verify Test Cases
    Scenario: TC_07_Test_Cases
      Given Tarayıciyi baslatarak "http://automationexercise.com" url'sine gidin
      Then Ana sayfanin basariyla gorunur oldugunu dogrulayin
      And Test Case buttonu na tiklayin
      Then Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin
      And ilgili sayfanin ekran goruntusunu alin
      And Kullanici 3 saniye bekler
      And Kullanici sayfayi kapatir

