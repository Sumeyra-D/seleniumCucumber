Feature: Google Arama Feature
  Background:
    Given Kullanici google sayfasindadir

    Scenario: Cucumber search
      When Kullanici  "cucumber" arattiginda
      Then Kullanici title da "cucumber" gormelidir