Feature: Google Search Test Feature
  Background: Kullanici her senaryoda google siltesinde olacaktir
    Given Kullanici google sayfasindadir



  Scenario: Kullanici samsung ardıgında samsung gormelidir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular

    Scenario: Kullanici cucumber aradiginda cucumber gormelidir
      When Kullanici cucumber kelimesini arar
      Then Kullanici sayfada cucumber kelimesi gectigini dogrular

      Scenario:Kullanici selenium aradiginda selenium gormelidir
        When Kullanici selenium kelimesini arar
        Then Kullanici sayfada selenium  kelimesi gectigini dogrular