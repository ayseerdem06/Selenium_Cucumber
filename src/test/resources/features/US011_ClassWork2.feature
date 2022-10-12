
Feature: US1011ClassWork
  Scenario: Herocap sitesi buton tarama

    And kullanici "https://the-internet.herokuapp.com/add_remove_elements/"  adresine gider
    And kullanici "Add Element" butonuna tiklar
    And kullanici "Delete" butonu gorunur oluncaya kadar bekler
    And kullanici "Delete" butonunun gorunur oldugunu test eder
    And kullanici "Delete" butonuna basarak butonu siler
    Then kullanici AddRemove Elements yazisinin gorunurlugunu test eder
    And kullanici "Delete" butonunun gorunmedigini test eder