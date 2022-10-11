
@parametre
Feature: US003 Parametre Kullanimi
  Background: Ortak adım
    Given kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar
    Then kullanici "selenium" icin arama yapar
    And sonuclarin "selenium" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar
    Then kullanici "SQL" icin arama yapar
    And sonuclarin "SQL" icerdigini test eder
    And sayfayi kapatir



    # Feature dosyasında parametreli arama yaptığımızda ""(tırnak) içine aldığımız string değeri stepDefinitionda
#Bir kere parametreli method oluşturur ve yeni bir arama yapmak istediğimizde
#Tekrar method oluşturmadan feature dosyasından ""(tırnak) içinde belirttiğimiz string ifadeyi değiştirmemiz
#yeterli olucaktır. Böylece kodlarımız dinamik olucaktır