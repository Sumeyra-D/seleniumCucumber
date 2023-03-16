Feature: Amazon Search Feature

  Scenario Outline: Kullanici ratacagı kelimeyi sonuclarda görebilmelidir
    Given Kullanici amazon sitesine girer.
    When Kullanici amazonda "<kelime>" arattir
    Then Kullanici arma sonuclarinda "<kelime>" gormelidir
    And Ekran goruntusu alir
    And Kullanici browser i kapatir

    Examples:
    |kelime|
    |mac   |
    |windows|
    |linux  |