# Autor: AnyerC

  @stories
  Feature: Academy Choucair
    As user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario
  Scenario: Search for a automation course
    Given than anyer wants to learn automation at the academy choucair
      | strUser    | strPassword   |
      | 1214724353 | Choucair2021* |
    When he search for the course Guias Tecnicas Analista Financial on the choucair academy plattform
    Then he finds the course called Guías Técnicas - Analista Financial