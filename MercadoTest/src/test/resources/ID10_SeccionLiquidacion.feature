
@tag
Feature: Seccion liquidacion
  

  @tag1
  Scenario: usuario entra en la seccion liquidacion
    Given Usuario entra a la pagina
    When click ofertas
    And click en liquidacion
    Then productos en liquidacion se muestran 