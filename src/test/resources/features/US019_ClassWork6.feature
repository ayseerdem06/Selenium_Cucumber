Feature: US017 Class Work

  Scenario: explicitly wait
    Given kullanici "demoqaUrl" anasayfasinda
    When kullanici Visible After bes seconds butonunun gorunur olmasini bekler
    And kullanici Visible After bes seconds butonunun gorunur oldugunu test eder