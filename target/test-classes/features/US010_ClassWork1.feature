
@Database
Feature:Class Calismasi
  Scenario Outline: TC01 Database Sitesine erisme

    Given kullanici "https://editor.datatables.net/" adresine gider
    Then  new butonuna basar
    And isim bolumune "<firstname>" girer
    And kullanici 1 sn bekler
    And soyisim bolumune "<lastname>" girer
    And kullanici 1 sn bekler
    And position bolumune"<position>" girer
    And kullanici 1 sn bekler
    And ofis bolumune "<ofisbilgisi>" girer
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" girer
    And kullanici 1 sn bekler
    And startdate bolumune"<Stardate>"  girer
    And kullanici 1 sn bekler
    And salary bolumune "<Salary>" girer
    And kullanici 1 sn bekler
    And Create tusuna basar
    And kullanici 1 sn bekler
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular

    Examples:
      | firstname | lastname | position | ofisbilgisi | extension | Stardate | Salary |
      | ayse | erdem | QA | Amazon | junior | 2022-10-12 | 15000 |
    #  | emsal | efe | Qa | Google | Senior | 2022-10-12 | 15000 |
    #  | yasemin | turker | Qa | Google | Junior | 2022-10-12 | 10500 |


    #5 farkli kullanici bilgisi girer