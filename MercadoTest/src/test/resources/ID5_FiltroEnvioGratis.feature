
@tag
Feature: Filtro envio gratis
  

  @tag1
  Scenario: usuario ordena por envio gratis
    Given Usuario entra a la pagina
    When click ofertas
    And click filtro envio gratis
    Then productos se muestran de acuerdo a si su envio es gratis


