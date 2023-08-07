
@tag
Feature: Filtro meses sin intereses
  

  @tag1
  Scenario: usuario ordena por meses sin intereses
    Given Usuario entra a la pagina
    When click ofertas
    And click filtro meses sin intereses
    Then productos se muestran de acuerdo a meses sin intereses